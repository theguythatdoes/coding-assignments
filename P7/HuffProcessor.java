import java.util.*;
/**
 * Although this class has a history of several years,
 * it is starting from a blank-slate, new and clean implementation
 * as of Fall 2018.
 * <P>
 * Changes include relying solely on a tree for header information
 * and including debug and bits read/written information
 * 
 * @author Owen Astrachan
 */

public class HuffProcessor  {

	public static final int BITS_PER_WORD = 8;
	public static final int BITS_PER_INT = 32;
	public static final int ALPH_SIZE = (1 << BITS_PER_WORD);
	public static final int PSEUDO_EOF = ALPH_SIZE;
	public static final int HUFF_NUMBER = 0xface8200;
	public static final int HUFF_TREE = HUFF_NUMBER | 1;

	private final int myDebugLevel;

	public static final int DEBUG_HIGH = 4;
	public static final int DEBUG_LOW = 1;

	public HuffProcessor() {
		this(0);
	}

	public HuffProcessor(int debug) {
		myDebugLevel = debug;
	}



	/**
	 * Compresses a file. Process must be reversible and loss-less.
	 *
	 * @param in  Buffered bit stream of the file to be compressed.
	 * @param out Buffered bit stream writing to the output file.
	 */
	public void compress(BitInputStream in, BitOutputStream out) {

		// remove all this code when implementing compress
     int[]counts=readForCounts(in);
     HuffNode root=makeTreeFromCounts(counts);
     String[] codings=makeCodingsFromTree(root);
     out.writeBits(BITS_PER_INT,HUFF_TREE);
     writeHeader(root,out);
     in.reset();
     writeCompressedBits(codings,in,out);
     out.close();

	}

	/**
	 * Decompresses a file. Output file must be identical bit-by-bit to the
	 * original.
	 *
	 * @param in  Buffered bit stream of the file to be decompressed.
	 * @param out Buffered bit stream writing to the output file.
	 */
	public void decompress(BitInputStream in, BitOutputStream out) {

		int magic = in.readBits(BITS_PER_INT);
		if (magic != HUFF_TREE) {
			throw new HuffException("invalid magic number " + magic);
		}
		HuffNode root = readTree(in);
		HuffNode current = root;
		while (true) {

			int bits = in.readBits(1);
			if (bits == -1) {
				throw new HuffException("bad input, no PSEUDO_EOF");
			} else {
				if (bits == 0) {
					current = current.myLeft;
				} else {
					current = current.myRight;
				}

				if (current.myLeft == null && current.myRight == null) {
					if (current.myValue == PSEUDO_EOF)
						break;   // out of loop
					else {
						out.writeBits(BITS_PER_WORD,current.myValue);
						current = root; // start back after leaf
					}
				}
			}
		}
		out.close();

	}








	private HuffNode readTree(BitInputStream in) {

		int bit = in.readBits(1);

		if (bit == -1) {
			throw new HuffException("No bit found");
		}

		if (bit == 0) {

			HuffNode left = readTree(in);

			HuffNode right = readTree(in);

			return new HuffNode(0, 0, left, right);

		}
		else {

			int value = in.readBits(BITS_PER_WORD + 1);

			return new HuffNode(value, 0, null, null);

		}
	}



private int[]readForCounts(BitInputStream in) {
	int[] countsArray = new int[ALPH_SIZE + 1];//the array is like a map;
	int nums = in.readBits(BITS_PER_WORD);
	while (nums != -1) {
		countsArray[nums] = countsArray[nums] + 1;
		nums = in.readBits(BITS_PER_WORD);

	}
	countsArray[PSEUDO_EOF] = 1;
	return countsArray;
}

	private HuffNode makeTreeFromCounts(int[] a){
		PriorityQueue<HuffNode> pq = new PriorityQueue<>();

		for( int i=0;i<a.length;i++) {
			if(a[i]>0) {

				pq.add(new HuffNode(i, a[i], null, null));
			}

		}


		while (pq.size() > 1) {

			HuffNode left = pq.remove();
			HuffNode right = pq.remove();
			// create new HuffNode t with weight from

			// left.weight+right.weight and left, right subtrees
			HuffNode t=new HuffNode(0,left.myWeight+right.myWeight,left,right);
			pq.add(t);
		}
		HuffNode root = pq.remove();

		return root;

	}
	private String[] makeCodingsFromTree(HuffNode root){
		String[] encodings = new String[ALPH_SIZE + 1];

		codingHelper(root,"",encodings);
		return encodings;

	}
	private void writeHeader(HuffNode root,BitOutputStream out){
	if(root.myLeft==null&& root.myRight==null){
		out.writeBits(1,1);
		out.writeBits(BITS_PER_WORD+1,root.myValue);

	}
	else{
		out.writeBits(1,0);
		writeHeader(root.myLeft,out);
		writeHeader(root.myRight,out);
	}


	}
	private void writeCompressedBits(String[]codings,BitInputStream in,BitOutputStream out){
	while(true){
		int bits=in.readBits(8);
		if(bits==-1){
			break;
		}
		String code= codings[bits];
		out.writeBits(code.length(),Integer.parseInt(code,2));
	}
		String code= codings[PSEUDO_EOF];
		out.writeBits(code.length(),Integer.parseInt(code,2));

	}


   private void codingHelper(HuffNode root,String path,String []encodings){
	   if(root==null){
	   	return;
	   }
	   if (root.myLeft==null&& root.myRight==null) {
		   encodings[root.myValue] = path;

		   return;

	   }
	   else {
		   codingHelper(root.myLeft, path + "0", encodings);
		   codingHelper(root.myRight, path + "1", encodings);

	   }

	   }

   }












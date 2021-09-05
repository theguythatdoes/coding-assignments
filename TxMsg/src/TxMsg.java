import java.util.*;
public class TxMsg {
    public String getMessage(String original) {
        ArrayList<String> aS= new ArrayList<String>(Arrays.asList(original.split(" ")));
        ArrayList<String> naS=new ArrayList<>();
        ArrayList<String> nnaS=new ArrayList<>();
        for(int i=0;i<aS.size();i++) {
            ArrayList<String>b=new ArrayList<String>(Arrays.asList(aS.get(i).split("")));
            if(b.size()<2){

            }

            for(int p=0;p<b.size();p++) {
                if (!b.get(p).equals("a") && !b.get(p).equals("e") && !b.get(p).equals("i") && !b.get(p).equals("o") && !b.get(p).equals("u")) {
                    naS.add(b.get(p));
                    for(int l=1;l<naS.size();l++){
                        if(naS.size()>2){
                        if(!naS.get(l).equals("a")||naS.get(l).equals("e")||naS.get(l).equals("i")||naS.get(l).equals("o")||naS.get(l).equals("u") ){
                            naS.remove(l+1);

                        }
                        if(naS.size()<2){
                            naS.retainAll(naS);
                        }//think about it like going through the string itself in order
                            //what info do you need to know and store
                            //iff all vowels or all consonants
                            //write it down
                            //use helper method
                    }



                        }
                }
            }

            for(int k=0;k<naS.size())
        }
    }
}

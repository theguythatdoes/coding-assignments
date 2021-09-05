public class Totality {
    public int sum(int[] a, String stype)  {
        int t=0;
        if (stype.equals("even")){
                for(int i=0;i<=a.length-1;i+=2) {
                     t+= a[i];
                }
        }
        if (stype.equals("odd")){
            for(int i=0; 2*i+1<a.length;i+=1){
                t+=a[2*i+1];
            }
        }
        if(stype.equals("all")) {
            for(int i=0;i<a.length;i+=1){
                t+=a[i];
            }
        }
        return t;




    }
}




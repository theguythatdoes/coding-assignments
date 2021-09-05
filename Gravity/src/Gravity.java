public class Gravity {
    public static void main(String[] args){
        double time= 1.0;
        double velo= 1.0;
                //System.out.println(Gravity.falling(time,velo));


    }
    public  double falling(double time, double velo){
       double distance=velo*time+(.5*9.8*time*time);
       return distance;
    }

}


import java.util.*;
public class OlympicCandles {
    public int numberOfNights(int[] candles){
       int nc=candles.length;
       for(int night=1;night<=nc;night++){
           Arrays.sort(candles);
           for(int j=nc-1;j>=nc-night;j--){
               if(candles[j]<=0) return night-1;
               candles[j] -=1;
           }

       }
       return nc;
    }

}

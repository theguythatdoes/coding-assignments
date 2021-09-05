
import java.util.*;
/* this allows you to access all the packages in java*/
public class TxMsg {
    public String getMessage(String original) {
        ArrayList<String> stringList=new ArrayList<String>();
        //Arraylist allows .add(add to arraylist) really easily
        //we make an arraylist to take in the strings
       String[] temp= original.split(" ");
       // .split takes a string and splits it and puts it into a string[]
        //we split up the words by spaces
       for(int i=0;i<temp.length;i++){
           // this is a for loop which starts from 0 and goes to 1 less than the lenth of the array and increments
           //we want to iterate thorugh each word to look for vowels
           if(!temp[i].contains("a")&&!temp[i].contains("e")&&!temp[i].contains("i")&&!temp[i].contains("o")&&!temp[i].contains("u")) {
            stringList.add(temp[0]);
            // we start with the case where there are no vowels
               // we merely add the string to our strinList
           }
           if(!temp[i].contains("a")||!temp[i].contains("e")||!temp[i].contains("i")||!temp[i].contains("o")||!temp[i].contains("u")){
               ArrayList<String> letterList=new ArrayList<String>(Arrays.asList(temp[i].split("")));
              for(int k=0;k<letterList.size();k++){
                  if(k == letterList.size() - 1) {
                      //handle final element here...
                      break;
                  }
                  if((letterList.get(k)!="a"&&letterList.get(k)!="e"&&letterList.get(k)!="i"&&letterList.get(k)!="o"&&letterList.get(k)!="u")&&((letterList.get(k+1)!="a"&&letterList.get(k+1)!="e"&&letterList.get(k+1)!="i"&&letterList.get(k+1)!="o"&&letterList.get(k+1)!="u"))){
                      letterList.remove(letterList.get(k+1));

                  }
                  letterList.remove("a");
                  letterList.remove("e");
                  letterList.remove("i");
                  letterList.remove("o");
                  letterList.remove("u");

              }
              String[] p=letterList.toArray(new String[0]);
              stringList.add(String.join("",p));
           }
           else{
               stringList.add(temp[i]);
           }
       }
       String[] ret=stringList.toArray(new String[0]);
      return String.join(" ",ret);

    }
}

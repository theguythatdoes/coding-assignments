public class ListSum {
    public int sum(ListNode list, int thresh) {
        int count=0;
       while(list!=null){
           if(list.info>thresh){ //if you are returing in your if statment then the next thing is
               // and else statement otherwise, its just an if statment;
               count+=list.info;
           }
          list=list.next;

       }
        return count;
    }
}

public class List2Long {
    public long convert(ListNode list) {
        long count=list.info;
       while(list!=null&&list.next!=null){
          count=(10*count)+list.next.info;
          list=list.next;


       }
        return count;
    }

}

public class MergeLists {
    public ListNode weave(ListNode a, ListNode b) {
       ListNode curlinode= new ListNode(b.info, null);
       ListNode curlinode2=new ListNode(a.info, curlinode);
       if(curlinode2.next==null){
           return curlinode;
       }
       a=a.next;
       b=b.next;
        while (a != null) {
                ListNode curlinode3=new ListNode(a.info);
            curlinode.next=curlinode3;
            curlinode=curlinode.next;
                a = a.next;
                ListNode curlindoe4=new ListNode(b.info);
                curlinode.next=curlindoe4;
                curlinode=curlinode.next;
                b=b.next;


        }
        return curlinode2;

    }
}





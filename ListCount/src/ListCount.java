public class ListCount {

   /* public class ListNode {
        int info;
        ListNode next;
        ListNode(int x){
            info = x;
        }
        ListNode(int x, ListNode node){
            info = x;
            next = node;
        }
    }*/
    public int count (ListNode list) {
        int pickle=0;
        while(list!=null){
            list=list.next;
            pickle+=1;

        }

        return pickle;
    }
}



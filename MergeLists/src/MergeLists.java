public class MergeLists {
    public ListNode stretch (ListNode list, int amount){
        // this is a linked list problem
        while(list!=null){
            /* while the list node is not null,and the amount in the list info is greater than
            1 we go on to the next element in the linked list . Once the while llop has stopped,
            what is left is the list we want.

             */
            while(amount-1>0){
                list.next=list;
            }
        }
        return list;
    }

}

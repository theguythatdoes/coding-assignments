public class ListStretch {
    public ListNode stretch(ListNode list, int amount) {
        ListNode temp=list;
        while (list != null) {
            if(amount==1){
                return temp;
            }

            for(int k=0;k<amount-1;k++) {
                ListNode temp2 = new ListNode(list.info, list.next);
                    list.next = temp2;

                }
            for(int k=0;k<amount;k++) {
                list = list.next;

            }
            }

            return temp;
        }
    }


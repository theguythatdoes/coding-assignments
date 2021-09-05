public class ContainsList {
    public String check(ListNode first, ListNode second){
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        while(first!=null){
            a+=1;
            first=first.next;

        }
        while(second!=null){
            b+=1;
            second=second.next;

        }
        if(b!=a){
            if(b>a) {
                return "NO";
            }
            if(a>b){
                while(first!=null&& first.next!=null&& first.info!=second.info&&first.next.info!=second.next.info){
                    d+=1;
                    first=first.next;
                    first.next=first.next.next;
                }
                if(d!=a-1){
                    return "YES";
                }
                if(d==a-1){
                return "NO";
                }
            }
        }
            while (first != null && (first.info == second.info)) {
                c += 1;
                first = first.next;
                second = second.next;
            }

            if(c==a){
                return "YES";
            }
                return "NO";
            }

        }





package algoritm.LinkedLIst;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
                                new ListNode(2,null)
        );
        swapPairs(l1);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null) return head;

        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode curr = dummy;


        while (curr.next != null && curr.next.next!=null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;


            first.next=second.next;
            second.next=first;
            curr.next=second;

            curr=first;
        }

        return dummy;
    }
}

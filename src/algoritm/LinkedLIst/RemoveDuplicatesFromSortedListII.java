package algoritm.LinkedLIst;

import java.util.LinkedList;

public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                            new ListNode(2,
                                    new ListNode(3,
                                            new ListNode(3,
                                                    new ListNode(4,
                                                            new ListNode(4,
                                                                    new ListNode(5,null))))))
        );


        System.out.println(deleteDuplicates(l1));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr=head;
        ListNode prev=dummy;

        while (curr !=null){
            boolean duplicate =false;

            while (curr.next!= null && curr.val == curr.next.val){
                curr=curr.next;
                duplicate=true;
            }
            if (duplicate){
                prev.next=curr.next;
            }else {
                prev=prev.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}

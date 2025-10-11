package algoritm.LinkedLIst;


//https://leetcode.com/problems/remove-linked-list-elements/description/

public class RemoveLinkedListElements {

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1,
//                            new ListNode(2,
//                                    new ListNode(6,
//                                            new ListNode(3,
//                                                    new ListNode(4,
//                                                            new ListNode(5,
//                                                                    new ListNode(6,null))))))
//        );

        ListNode l1 = new ListNode(7,
                            new ListNode(7,
                                    new ListNode(7,
                                            new ListNode(7,null)))
        );
        System.out.println(removeElements(l1,7));
    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;

        while(curr != null){
            if (curr.val == val  && head!=null) head=head.next;

            if(curr.next!= null && curr.next.val == val){
                curr.next=curr.next != null ? curr.next.next : null;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }

}

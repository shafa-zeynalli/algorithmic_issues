package algoritm.LinkedLIst;

//https://leetcode.com/problems/reverse-linked-list/description

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                            new ListNode(2,
                                    new ListNode(3,null))
        );

        System.out.println(reverseList(l1));
    }



    public static ListNode reverseList(ListNode head) {
        if (head==null || head.next == null) return head;

        ListNode curr = head;
        ListNode prevL = null;

        while (curr != null) {
            ListNode nextL = new ListNode();

            nextL.val = curr.val;
            nextL.next = prevL;
            prevL = nextL;

            curr=curr.next;
        }
        return prevL;
    }
}

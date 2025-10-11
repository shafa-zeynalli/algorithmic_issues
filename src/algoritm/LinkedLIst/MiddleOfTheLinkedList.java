package algoritm.LinkedLIst;

//https://leetcode.com/problems/middle-of-the-linked-list/description/

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5,null))))
        );

        System.out.println(middleNode(l1));
    }

    public static ListNode middleNode(ListNode head) {
        if (head==null || head.next == null) return head;

        ListNode curr = head;
        ListNode prevL = null;

        int count=0;

        while (curr != null) {
            count++;

            ListNode nextL = new ListNode();

            nextL.val = curr.val;
            nextL.next = prevL;
            prevL = nextL;

            curr=curr.next;
        }

        int n= (int) Math.ceil((double)count/2);


        ListNode curr2 = prevL;
        ListNode prev2 = null;
        while (n>0){
            ListNode next = new ListNode();

            next.val = curr2.val;
            next.next = prev2;
            prev2 = next;

            curr2=curr2.next;
            n--;
        }

        return prev2;
    }
}

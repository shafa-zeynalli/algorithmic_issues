package algoritm.LinkedLIst;


//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

        ListNode l = new ListNode(8,
                            new ListNode(4,
                                    new ListNode(5,null)));

        ListNode l1 = new ListNode(4,
                             new ListNode(1,l));

        ListNode l2 = new ListNode(5,
                            new ListNode(6,
                                    new ListNode(1,l)));

        System.out.println(getIntersectionNode(l1,l2));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int lenA = getLength(headA);
        int lenB = getLength(headB);

        int diff=Math.abs(lenA-lenB);

        if (lenA > lenB){
            while (diff-- >0) headA=headA.next;
        }else {
            while (diff-- >0) headB=headB.next;
        }

        while (headA != null || headB!= null){
            if(headA == headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }

    private static int getLength(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}

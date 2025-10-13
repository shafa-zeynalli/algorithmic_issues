package algoritm.LinkedLIst;

//https://leetcode.com/problems/odd-even-linked-list/


public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                            new ListNode(2,
                                    new ListNode(3,
                                            new ListNode(4,
                                                    new ListNode(5,null))))
        );
        System.out.println(oddEvenList(l1));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode prevOddLN = null;
        ListNode prevEvenLN = null;

        while (curr != null){
            ListNode l =curr;
            curr = curr.next;
            l.next = prevOddLN;
            prevOddLN = l;

            if (curr != null){
                ListNode l1 = curr;
                curr = curr.next;
                l1.next = prevEvenLN;
                prevEvenLN=l1;
            }
        }
        ListNode prev= null;

        while (prevEvenLN != null){
            ListNode l1 = prevEvenLN;
            prevEvenLN = prevEvenLN.next;
            l1.next = prev;
            prev=l1;
        }
        while (prevOddLN != null) {
            ListNode l = prevOddLN;
            prevOddLN = prevOddLN.next;
            l.next = prev;
            prev = l;
        }

        return prev;
    }



//    public static ListNode oddEvenList(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode curr = head;
//
//        ListNode oddLN = new ListNode();
//        ListNode oddL = oddLN;
//
//        ListNode evenLN = new ListNode();
//        ListNode evenL = evenLN;
//
//        while (curr != null){
//            ListNode l = new ListNode();
//            l.val = curr.val;
//            oddLN.next = l;
//            oddLN=l;
//
//            curr = curr.next;
//
//            if (curr != null){
//                ListNode l1 = new ListNode();
//                l1.val = curr.val;
//                evenLN.next = l1;
//                evenLN=l1;
//
//                curr = curr.next;
//            }
//        }
//        oddLN.next=evenL.next;
//        return oddL.next;
//    }
}

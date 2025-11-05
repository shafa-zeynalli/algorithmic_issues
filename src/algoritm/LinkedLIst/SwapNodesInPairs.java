package algoritm.LinkedLIst;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
//                                new ListNode(4,
                                        new ListNode(4,null)))
        );
//        swapPairs(l1);
    }

//    public static ListNode swapPairs(ListNode head) {
//        if (head==null || head.next==null) return head;
//
//        ListNode left = head, right = head;
//
//        while (right.next!=null && right.next.next!=null){
//            left=left.next;
//            right=right.next.next;
//        }
//
//        right=left.next;
//        left=head;
//        ListNode curr = right;
//        while (left != null){
//            ListNode nextL = left.next != null ? left.next : null;
//            ListNode nextR = right.next != null ? right.next : null;
//
//            right.next=nextL;
//            left.next=right;
//
//            right = nextR;
//            left=nextL;
//        }
//
//        return curr;
//    }
}

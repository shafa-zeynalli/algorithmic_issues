package algoritm.Sort;


//https://leetcode.com/problems/sort-list/

import algoritm.LinkedLIst.ListNode;

public class SortList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4,
                            new ListNode(2,
                                    new ListNode(1,
                                            new ListNode(3,null)))
                    );
        sortList(l1);
    }

    private static ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode left = head;
        ListNode right = head;

        while (right.next != null && right.next.next != null){
            left=left.next;
            right=right.next.next;
        }
        right=left.next;
        left.next=null;
        left=head;

        left=sortList(left);
        right=sortList(right);
        return mergeList(left,right);
    }

    private static ListNode mergeList(ListNode left, ListNode right) {
        ListNode dummy=new ListNode(0,null);
        ListNode curr = dummy;

        while (left != null && right != null){
            if (left.val < right.val){
                curr.next  = left;
                left = left.next;
            }else{
                curr.next  = right;
                right = right.next;
            }
            curr=curr.next;
        }

        if (left != null) curr.next  = left;

        if (right != null) curr.next  = right;

        return dummy.next;
    }
}

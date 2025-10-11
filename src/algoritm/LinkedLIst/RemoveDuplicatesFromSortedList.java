package algoritm.LinkedLIst;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                            new ListNode(1,
                                    new ListNode(1,null))
        );

       deleteDuplicates(l1);
    }

    public static  ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode curr = head;

        while(curr.next != null){
            if( curr.next.val == curr.val){
                curr.next=curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}

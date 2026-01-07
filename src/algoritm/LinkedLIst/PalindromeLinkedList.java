package algoritm.LinkedLIst;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                new ListNode(0,
//                        new ListNode(3,
//                                new ListNode(4,
                                        new ListNode(0,null))
        );
        System.out.println(isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        fast=slow.next;
        ListNode curr2 = head;
        slow.next=null;

        ListNode prev = null;
        ListNode curr1 = fast;
        while(curr1 != null){
            ListNode next = curr1.next;
            curr1.next=prev;
            prev=curr1;
            curr1=next;
        }
        curr1=prev;

        while(curr1 != null && curr2 != null){
                if (curr1.val != curr2.val) return false;
                curr1=curr1.next;
                curr2=curr2.next;
        }
        return true;
    }
}

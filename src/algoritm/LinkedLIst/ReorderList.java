package algoritm.LinkedLIst;


//https://leetcode.com/problems/reorder-list/description/

public class ReorderList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(4,
                                        new ListNode(2,null)
        );
        System.out.println(reorderList(l1));
    }


    public static ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) return head;

        int avg = (int) Math.ceil((double) getCount(head) / 2);
        boolean isEven= avg%2 == 0 ? true :false;

        ListNode curr = head;
        ListNode prevLeft = null;
        ListNode prevRight = null;

        while (avg-- > 0) {
            ListNode l = curr;
            curr = curr.next;
            l.next = prevLeft;
            prevLeft = l;
        }
        while (curr != null){
                ListNode l1 = curr;
                curr = curr.next;
                l1.next = prevRight;
                prevRight=l1;
        }

        ListNode prevE = null;
        while (prevRight != null) {
            ListNode l1 = prevRight;
            prevRight = prevRight.next;
            l1.next = prevE;
            prevE = l1;
        }
        prevRight=prevE;

        if(isEven){
            prevRight=prevLeft;
            prevLeft=prevE;
        }
        ListNode prev= null;

        while (prevLeft != null || prevRight != null) {
            ListNode l = prevLeft;
            prevLeft = prevLeft.next;
            l.next = prev;
            prev = l;

            if (prevRight != null) {
                ListNode l1 = prevRight;
                prevRight = prevRight.next;
                l1.next = prev;
                prev = l1;
            }
        }

        return prev;
    }

    private static int getCount(ListNode head){
        int c=0;
        while (head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
}

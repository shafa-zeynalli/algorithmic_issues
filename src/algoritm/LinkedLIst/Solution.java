package algoritm.LinkedLIst;

class Solution {
    public static void main(String[] args) {
//        ListNode h = new ListNode(1,
//                                        new ListNode(2,
//                                                new ListNode(3,
//                                                        new ListNode(4,
//                                                                new ListNode(5,null)))));
        ListNode h = new ListNode(1,
                new ListNode(2,null));
        removeNthFromEnd(h,1);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;

        int num=0;

        ListNode current1 = head;
        while(current1.next != null){
            current1=current1.next;
            num++;
        }


        if(num==1 && n==1){
            ListNode cur2=null;
            return cur2;
        }


        ListNode current = head;
        while(current.next != null){

            if(num==n){
                // current.next=current.next !=null ? current.next.next : null;
                current.next= current.next.next;
                return head;
            }
            current=current.next;
            num--;
        }
        return head;
    }
}

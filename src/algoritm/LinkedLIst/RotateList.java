package algoritm.LinkedLIst;

public class RotateList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,null))))
        );


        System.out.println(rotateRight(l1,2));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null) return head;

        int size  = getSize(head);
        if(k>size){
            k%=size;
        }

        while (k>0){

            ListNode curr=head;
            ListNode prev=curr;

            while (curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            curr.next=head;
            head=curr;

            k--;
        }

        return head;
    }

    private static int getSize(ListNode root){
        int n=0;

        ListNode curr = root;

        while (curr!=null){
            curr=curr.next;
            n++;
        }
        return n;
    }
}

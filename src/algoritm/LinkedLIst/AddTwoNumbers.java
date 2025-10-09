package algoritm.LinkedLIst;

//https://leetcode.com/problems/add-two-numbers/description/

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,
                      new ListNode(4,
                      new ListNode(3,null)));

        ListNode l2 = new ListNode(5,
                                        new ListNode(6,
                                                new ListNode(4,null)));

        System.out.println(addTwoNumbers(l1,l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = null;
        int carry=0;

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while(curr1!=null || curr2 !=null){
            int sum=0;

            if(curr1!=null){
                sum+=curr1.val;
                curr1=curr1.next;
            }

            if(curr2!=null){
                sum+=curr2.val;
                curr2=curr2.next;
            }

            sum+=carry;

            if(sum>=10){
                carry = sum/10;
                sum=sum%10;
            }else{carry=0;}

            ListNode l3 = new ListNode();
            l3.val=sum;
            l3.next=l;
            l=l3;
        }
        if(carry>0){
            ListNode n = new ListNode();
            n.val=carry;
            n.next=l;
            l=n;
        }

        ListNode curr = l;
        ListNode prev = null;

        while(curr!=null){
             ListNode next = null;
             next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
// class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

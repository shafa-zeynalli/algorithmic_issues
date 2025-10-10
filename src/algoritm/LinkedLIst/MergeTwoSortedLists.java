package algoritm.LinkedLIst;


//https://leetcode.com/problems/merge-two-sorted-lists/description/

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5,null
//                            new ListNode(2,
//                                    new ListNode(4,null))
        );

        ListNode l2 = new ListNode(1,
                            new ListNode(3,
                                    new ListNode(4,null))
                                    );

        mergeTwoLists(l1,l2);
    }





    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode l = null;
        ListNode nextL = new ListNode();

        ListNode curr1 = list1;
        ListNode curr2 = list2;

        if(curr1!=null && curr2!=null && curr1.val>curr2.val){
            ListNode c = null;
            c=curr1;
            curr1=curr2;
            curr2=c;
        }
        if(curr1!=null){
            ListNode l3 = new ListNode();
            l3.val = curr1.val;
            l=l3;
            nextL=l;
            curr1=curr1.next;
        }


        while(curr1!=null || curr2!=null){
            if(curr1 !=null && curr2 !=null ){
                if (curr1.val < curr2.val){
                    ListNode l0 = new ListNode();
                    l0.val = curr1.val;
                    nextL.next = l0 ;
                    nextL=l0;
                    curr1=curr1.next;
                }else {
                    ListNode l0 = new ListNode();
                    l0.val = curr2.val;
                    nextL.next = l0 ;
                    nextL=l0;
                    curr2=curr2.next;
                }
            } else if (curr1 !=null) {
                ListNode l0 = new ListNode();
                l0.val = curr1.val;
                nextL.next = l0 ;
                nextL=l0;
                curr1=curr1.next;
            } else if(curr2 !=null ){
                ListNode l0 = new ListNode();
                l0.val = curr2.val;
                nextL.next = l0 ;
                nextL=l0;
                curr2=curr2.next;
            }
        }
        return l;
    }

    public static ListNode appointList(ListNode l,ListNode nextL, ListNode curr){
        ListNode l0 = new ListNode();
        l0.val = curr.val;
        nextL.next = l0 ;
        nextL=l0;
        curr=curr.next;
        return curr;
    }









//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode l = null;
//        ListNode nextL = null;
//
//        ListNode curr1 = list1;
//        ListNode curr2 = list2;
//
//        while(curr1!=null || curr2!=null){
//            if(curr1!=null && curr2!=null && curr1.val>curr2.val){
//                    ListNode c = null;
//                    c=curr1;
//                    curr1=curr2;
//                    curr2=c;
//            }
//
//            if(curr1 !=null ){
//                if(l==null){
//                    ListNode l3 = new ListNode();
//                    l3.val = curr1.val;
//                    l=l3;
//                    nextL=l;
//                }else{
//                    ListNode l3 = new ListNode();
//                    l3.val = curr1.val;
//                    nextL.next = l3 ;
//                    nextL=l3;
//                }
//                curr1=curr1.next;
//            }
//
//            if(curr2 !=null ){
//                if(l==null){
//                    ListNode l3 = new ListNode();
//                    l3.val = curr2.val;
//                    l=l3;
//                    nextL=l;
//                }else{
//                    ListNode l3 = new ListNode();
//                    l3.val = curr2.val;
//                    nextL.next = l3 ;
//                    nextL=l3;
//                }
//                curr2=curr2.next;
//            }
//        }
//        return l;
//    }
}

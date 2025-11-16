package algoritm.BST;


//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/

import algoritm.LinkedLIst.ListNode;

public class ConvertSortedListToBinarySearchTree {
    public static ListNode head1 = null;

    public static void main(String[] args) {
        ListNode l = new ListNode(1,
                            new ListNode(3,
                                    new ListNode(4,null)));

        System.out.println(sortedListToBST(l));
    }

    public static TreeNode sortedListToBST(ListNode head) {
        head1 = head;
        int size = getSize(head);
        return buildBST(0, size - 1);
    }

    private static TreeNode buildBST(int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;

        TreeNode leftChild = buildBST(left, mid - 1);
        TreeNode root = new TreeNode(head1.val);
        head1 = head1.next;
        TreeNode rightChild = buildBST(mid + 1, right);

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    private static int getSize(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}

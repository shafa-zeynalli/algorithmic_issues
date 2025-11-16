package algoritm.BST;


//https://leetcode.com/problems/kth-smallest-element-in-a-bst

public class KthSmallestElementINaBST {
    private static int count = 0;
    private static TreeNode result;

    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(kthSmallest(tree,2));
    }
    private static int kthSmallest(TreeNode root, int k) {
        traversal(root,k);
        return result.val;
    }

    private static void traversal(TreeNode root, int k){
        if (root==null) return;
        traversal(root.left,k);
        count++;
        if (count ==k) {
           result =  root;
           return;
        }
        traversal(root.right,k);
    }
}

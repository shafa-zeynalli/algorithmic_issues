package algoritm.BST;


//https://leetcode.com/problems/validate-binary-search-tree

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(isValidBST(tree));
    }

    private static boolean isValidBST(TreeNode root) {
       return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean isValid(TreeNode root,long min, long max) {
        if (root==null) return true;
        if(root.val >= max || root.val <= min) return false;
        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    }
}

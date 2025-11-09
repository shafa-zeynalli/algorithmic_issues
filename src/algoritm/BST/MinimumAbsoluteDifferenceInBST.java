package algoritm.BST;


//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

public class MinimumAbsoluteDifferenceInBST {
    private static Integer prev = null;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,0);
        tree=BasicOperationsOnTrees.add(tree,48);
//        tree=BasicOperationsOnTrees.add(tree,null);
        tree=BasicOperationsOnTrees.add(tree,12);
        tree=BasicOperationsOnTrees.add(tree,49);

        System.out.println(getMinimumDifference(tree));
//        BasicOperationsOnTrees.iterate(tree);
    }

    public static int getMinimumDifference(TreeNode root) {
       inOrder(root);
       return min;
    }
    private static void inOrder(TreeNode root){
        if (root==null) return;
        inOrder(root.left);
        if (prev!=null) min=Math.min(min, root.val-prev);
        prev= root.val;
        inOrder(root.right);
    }


}

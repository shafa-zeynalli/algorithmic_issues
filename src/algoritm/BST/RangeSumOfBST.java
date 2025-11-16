package algoritm.BST;

//https://leetcode.com/problems/range-sum-of-bst/description/

public class RangeSumOfBST {
    private static Integer i = 0;

    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,10);
        tree=BasicOperationsOnTrees.add(tree,5);
        tree=BasicOperationsOnTrees.add(tree,15);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,7);
        tree=BasicOperationsOnTrees.add(tree,18);

        System.out.println(rangeSumBST(tree,7,15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root==null) return 0;
        rangeSumBST(root.left,low,high);
        if (root.val >= low && root.val <=high ) i+= root.val;
        rangeSumBST(root.right,low,high);
        return i;
    }
}

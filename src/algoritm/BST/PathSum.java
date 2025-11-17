package algoritm.BST;


//https://leetcode.com/problems/path-sum/description/

public class PathSum {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,5);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,7);

        System.out.println(hasPathSum(tree, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return sumValue(root, targetSum, 0);
    }

    private static boolean sumValue(TreeNode root, int targetSum, int sum) {
        if(root==null) return false;
        sum += root.val;

        if (root.left==null && root.right==null) return sum==targetSum;

        return sumValue(root.right,targetSum,sum) || sumValue(root.left,targetSum,sum);
    }
}

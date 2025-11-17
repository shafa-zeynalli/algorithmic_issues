package algoritm.BST;

//https://leetcode.com/problems/sum-of-left-leaves
public class SumOfLeftLeaves {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,3);
        tree= BasicOperationsOnTrees.add(tree,9);
        tree=BasicOperationsOnTrees.add(tree,20);
        tree=BasicOperationsOnTrees.add(tree,15);
        tree=BasicOperationsOnTrees.add(tree,7);

        System.out.println(sumOfLeftLeaves(tree));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;

        int sum = 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sum+=sumOfLeftLeaves(root.left);
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }

}

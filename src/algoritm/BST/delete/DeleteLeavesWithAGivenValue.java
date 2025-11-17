package algoritm.BST.delete;


import algoritm.BST.BasicOperationsOnTrees;
import algoritm.BST.TreeNode;

//https://leetcode.com/problems/delete-leaves-with-a-given-value
public class DeleteLeavesWithAGivenValue {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,5);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,7);

        System.out.println(removeLeafNodes(tree,2));
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root==null) return null;

        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);

        if (root.left==null && root.right == null && root.val == target){
            return null;
        }
        return root;

    }
}

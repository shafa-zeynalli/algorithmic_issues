package algoritm.BST.delete;

import algoritm.BST.BasicOperationsOnTrees;
import algoritm.BST.TreeNode;

public class DeleteNodeINaBST {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(deleteNode(tree,3));
    }

    public static TreeNode deleteNode(TreeNode root, int n) {
        if (root == null) return  null;

        if (root.val == n){
            if (root.left == null && root.right == null) return null;

            if (root.right != null){
                root.val = getMin(root.right);
                root.right = deleteNode(root.right, getMin(root.right));
                return root;
            }
            root.val = getMax(root.left);
            root.left = deleteNode(root.left, getMax(root.left));
            return root;
        }
        if (root.val < n){
            root.right = deleteNode(root.right,n);
            return root;
        }
        root.left = deleteNode(root.left,n);
        return root;
    }

    private static int getMin(TreeNode root){
        if (root==null) return -1;
        if(root.left==null) return root.val;
        return getMin(root.left);
    }

    private static int getMax(TreeNode root){
        if (root==null) return -1;
        if(root.right==null) return root.val;
        return getMin(root.right);
    }
}

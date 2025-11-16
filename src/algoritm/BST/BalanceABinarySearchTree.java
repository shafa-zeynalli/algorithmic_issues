package algoritm.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BalanceABinarySearchTree {
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(balanceBST(tree));
    }

    public static TreeNode balanceBST(TreeNode root){
        inorder(root);
        return build(0, list.size()-1);
    }

    public static void inorder(TreeNode root) {
        if (root==null) return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private static TreeNode build(int left, int right){
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode rootNode = new TreeNode(list.get(mid));

        rootNode.left = build(left, mid - 1);
        rootNode.right = build( mid + 1,right);
        return rootNode;
    }
}

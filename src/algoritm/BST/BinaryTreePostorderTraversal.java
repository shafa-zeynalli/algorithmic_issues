package algoritm.BST;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);
        System.out.println(postorderTraversal(tree));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        traversal(root,l);
        return l;
    }

    public static void traversal(TreeNode root, List l) {
        if(root==null) return;
        traversal(root.left,l);
        traversal(root.right,l);
        l.add(root.val);
    }
}

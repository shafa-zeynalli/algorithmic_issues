package algoritm.BST;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(inorderTraversal(tree));
    }
    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
       return traversal(root,l);
    }
    private static List<Integer> traversal(TreeNode root, List l){
        if (root==null) return l;
        traversal(root.left,l);
        l.add(root.val);
        traversal(root.right,l);
        return l;
    }

}

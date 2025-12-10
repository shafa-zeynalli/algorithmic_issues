package algoritm.BST;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(preorderTraversal(tree));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        return orderTraversal(root,l);
    }
    public static List<Integer> orderTraversal(TreeNode root, List l){
        if (root==null) return l;
        l.add(root.val);
        orderTraversal(root.left,l);
        orderTraversal(root.right,l);
        return l;
    }
}

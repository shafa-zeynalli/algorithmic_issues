package algoritm.BST;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {
    public static List<Integer> l=new ArrayList<>();
    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);
        System.out.println(minDiffInBST(tree));
    }
    public static int minDiffInBST(TreeNode root) {
        traversal(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < l.size(); i++) {
            min = Math.min(min, l.get(i) - l.get(i - 1));
        }

        return min;
    }
    public static void traversal(TreeNode root) {
        if(root==null) return;
        traversal(root.left);
        l.add(root.val);
        traversal(root.right);
    }
}

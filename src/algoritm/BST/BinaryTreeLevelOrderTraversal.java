package algoritm.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);
        System.out.println(levelOrder(tree));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> l1 = new ArrayList<>();

            for (int i=0; i<size; i++){
                TreeNode node = q.poll();
                l1.add(node.val);

                if (node.left!=null) q.add(node.left);
                if (node.right!=null) q.add(node.right);
            }
            result.add(l1);
        }

        return result;
    }
}

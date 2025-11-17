package algoritm.BST.delete;

//https://leetcode.com/problems/delete-nodes-and-return-forest

import algoritm.BST.BasicOperationsOnTrees;
import algoritm.BST.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {

    public static void main(String[] args) {

        TreeNode tree = null;
        tree=BasicOperationsOnTrees.add(tree,1);
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,5);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,7);

        int[] arr = {3,5};
        System.out.println(delNodes(tree,arr));
    }

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> deleteNums = new HashSet<>();
        for (int i : to_delete) deleteNums.add(i);

        List<TreeNode> l = new ArrayList<>();
        root = delete(root,deleteNums,l);

        if (root!=null)  l.add(root);

        return l;
    }

    public static TreeNode delete(TreeNode root, Set<Integer> nums, List<TreeNode> l) {
        if (root==null) return null;

        root.right = delete(root.right, nums, l);
        root.left = delete(root.left, nums, l);

        if(nums.contains(root.val)){
            if (root.left!=null)  l.add(root.left);
            if (root.right!=null)  l.add(root.right);
            return null;
        }

        return root;
    }
}

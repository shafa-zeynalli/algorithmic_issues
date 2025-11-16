package algoritm.BST;

//https://leetcode.com/problems/search-in-a-binary-search-tree

public class SearchInABinarySearchTree {
    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,26);
        tree=BasicOperationsOnTrees.add(tree,57);
        tree=BasicOperationsOnTrees.add(tree,45);
        tree=BasicOperationsOnTrees.add(tree,190);
        tree=BasicOperationsOnTrees.add(tree,5);
        tree=BasicOperationsOnTrees.add(tree,346);

        tree=searchBST(tree,57);
        BasicOperationsOnTrees.iterate(tree);
    }


    public static TreeNode searchBST(TreeNode root, int n) {
        if (root==null) return root;
        if (root.val==n) return root;
        if(root.val > n) return searchBST(root.left,n);
        else return searchBST(root.right,n);
    }

}

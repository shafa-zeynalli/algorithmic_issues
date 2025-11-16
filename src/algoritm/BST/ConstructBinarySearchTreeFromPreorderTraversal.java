package algoritm.BST;


//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        System.out.println(bstFromPreorder(preorder));
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode tree = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            tree = add(tree,preorder[i]);
        }
        return tree;
    }

    private static TreeNode add(TreeNode tree, int n){
        if (tree==null){
            TreeNode t = new TreeNode();
            t.val=n;
            t.left=null;
            t.right=null;
            tree=t;
            return tree;
        }

        if (tree.val > n) {
            tree.left = add(tree.left,n);
            return tree;
        }

        tree.right = add(tree.right,n);
        return tree;
    }

}

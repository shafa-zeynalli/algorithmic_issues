package algoritm.BST;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,3);

        TreeNode p = null;
        p = BasicOperationsOnTrees.add(p,2);

        TreeNode q = null;
        q = BasicOperationsOnTrees.add(q,8);

        System.out.println(lowestCommonAncestor(tree, p, q));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if( root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if( root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

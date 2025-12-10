package algoritm.BST;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(isSymmetric(tree));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;

        return checkSymmetric(root.left,root.right);
    }
    public static boolean checkSymmetric(TreeNode r, TreeNode q) {
        if ((r==null && q!=null) || (r!=null && q==null)) return false;

        if(r.val!=q.val) return false;
        return checkSymmetric(r.left,q.right) && checkSymmetric(r.right, q.left);
    }

}

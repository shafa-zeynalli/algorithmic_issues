package algoritm.BST;

//https://leetcode.com/problems/same-tree/description/

public class SameTree {
    public static void main(String[] args) {

        TreeNode tree1 = null;
        tree1= BasicOperationsOnTrees.add(tree1,1);
        tree1= BasicOperationsOnTrees.add(tree1,2);
        tree1=BasicOperationsOnTrees.add(tree1,3);

        TreeNode tree2 = null;
        tree2=BasicOperationsOnTrees.add(tree2,1);
        tree2=BasicOperationsOnTrees.add(tree2,2);
        tree2=BasicOperationsOnTrees.add(tree2,3);

        System.out.println(isSameTree(tree1,tree2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q == null) return true;

        if(p==null) return false;
        if(q==null) return false;
        if (p.val!=q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

package algoritm.BST;

public class CountCompleteTreeNodes {

    public static Integer i = 0;

    public static void main(String[] args) {
        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,3);

        System.out.println(countNodes(tree));
    }
    public static int countNodes(TreeNode root) {
        if (root==null) return 0;
        count(root);
        return i;
    }
    public static void count(TreeNode root) {
        if (root==null) return;
        i++;
        count(root.left);
        count(root.right);
    }

}

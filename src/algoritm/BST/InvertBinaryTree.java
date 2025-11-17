package algoritm.BST;


//https://leetcode.com/problems/invert-binary-tree
public class InvertBinaryTree {
    public static void main(String[] args) {

        TreeNode tree = null;
        tree= BasicOperationsOnTrees.add(tree,1);
        tree= BasicOperationsOnTrees.add(tree,2);
        tree=BasicOperationsOnTrees.add(tree,3);
        tree=BasicOperationsOnTrees.add(tree,4);
        tree=BasicOperationsOnTrees.add(tree,5);
        tree=BasicOperationsOnTrees.add(tree,6);
        tree=BasicOperationsOnTrees.add(tree,7);

        System.out.println(invertTree(tree));
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root==null) return null;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        if (root.left!=null && root.right!=null){
            TreeNode t = new TreeNode();
            t=root.left;
            root.left=root.right;
            root.right=t;
            return root;
        }
        if (root.left!=null){
            root.right = root.left;
            root.left = null;
            return root;
        }

        root.left = root.right;
        root.right = null;
        return root;
    }
}


package algoritm.BST;


import com.sun.source.tree.Tree;

public class BasicOperationsOnTrees {

    public static void main(String[] args) {
        TreeNode tree = null;
        tree=add(tree,26);
        tree=add(tree,57);
        tree=add(tree,45);
        tree=add(tree,190);
        tree=add(tree,5);
        tree=add(tree,346);
        iterate(tree);
//        System.out.println(search(tree,5));
//        System.out.println(search(tree,10));
        System.out.println("MIN: " + getMin(tree));
        System.out.println("MAX: " +getMax(tree));
        delete(tree, 5);
        iterate(tree);
    }

    public static TreeNode add(TreeNode root, int n){
        if (root==null){
            TreeNode t = new TreeNode();
            t.val=n;
            t.left=null;
            t.right=null;
            root=t;
            return root;
        }
        if (n > root.val){
            root.right=add(root.right,n);
            return root;
        }
        root.left=add(root.left,n);
        return root;
    }
    public static TreeNode delete(TreeNode root, int n){
        if (root==null) return null;

        if (root.val == n) {
            if (root.right == null && root.left == null) return null;

            if (root.right!=null){
                root.val = getMin(root.right);
                root.right = delete(root.right, getMin(root.right));
                return root;
            }
            root.val = getMax(root.left);
            root.left = delete(root.left, getMax(root.left));
        }
        if(root.val < n){
            root.right = delete(root.right, n);
            return root;
        }
        root.left = delete(root.left,n);
        return root;
    }

    public static void iterate(TreeNode root){
        if (root==null) return;
        iterate(root.left);
        System.out.print(root.val + " ");
        iterate(root.right);
    }

    public static int search(TreeNode root, int n){
        if (root==null) return -1;
        if (root.val==n) return 1;
        if (search(root.left,n) == 1) return 1;
        if (search(root.right,n) == 1) return 1;
        return -1;
    }
    public static int getMin(TreeNode root){
        if (root==null) return -1;
        if (root.left==null) return root.val;
        return getMin(root.left);
    }
    public static int getMax(TreeNode root){
        if (root==null) return -1;
        if (root.right==null) return root.val;
        return getMax(root.right);
    }
}

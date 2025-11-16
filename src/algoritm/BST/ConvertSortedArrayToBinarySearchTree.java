package algoritm.BST;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        System.out.println(sortedArrayToBST(preorder));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0, nums.length-1);
    }

    private static TreeNode build(int[] arr, int left, int right){
        if(left > right) return  null;

        int mid = (left + right)/2;

        TreeNode tree = new TreeNode(arr[mid]);
        tree.left = build(arr,left,mid-1);
        tree.right = build(arr,mid+1,right);
        return tree;
    }
}

package algoritm.BST;

public class MaximumBinaryTree {
    public static void main(String[] args) {
        int[] nums= {3,2,1,6,0,5};
        System.out.println(constructMaximumBinaryTree(nums));
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(0, nums.length-1, nums);
    }
    public static TreeNode build( int start, int end, int[] nums) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        TreeNode t = new TreeNode();
        t.val=nums[maxIndex];
        if (start>end){
            t.left=build(start,maxIndex-1,nums);
            t.right=build(maxIndex+1,end,nums);
        }
        return t;
    }
}

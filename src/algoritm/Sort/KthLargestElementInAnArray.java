package algoritm.Sort;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
    public static int findKthLargest(int[] nums, int k) {
        quickSort(nums,0, nums.length-1);
        return nums[nums.length-k];
    }

    public static void quickSort(int[] nums, int low, int high){
        if(low < high){
            int p = partition(nums,low,high);

            quickSort(nums,low,p-1);
            quickSort(nums,p+1, high);
        }
    }

    public static int partition(int[] nums, int low, int high){
        int p = nums[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (nums[j] < p){
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
        return i+1;
    }
}

package algoritm.sliding_window_fixed_size;

public class NumberOfSubArraysOfSizeK {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,5,5,5,8};

        System.out.println(numOfSubarrays(nums,3,4));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0, count=0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }

        if (sum/k>=threshold) count++;

        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            if (sum/k>=threshold) count++;
        }
        return count;
    }

}

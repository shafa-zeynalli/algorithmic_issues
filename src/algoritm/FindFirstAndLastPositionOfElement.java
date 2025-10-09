package algoritm;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
public class FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
//        int[] nums = {5,7,7,8,8,10};
        int[] nums = {1};
        System.out.println(searchRange(nums,1));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        int[] arr = new int[2];

        while(left<=right){
            int mid=(left + right) / 2;

            if(nums[mid]==target){
                int n1=0;
                int n2=0;

                while(mid>=0 && nums[mid]==target){
                    n2=mid;
                    mid--;
                }
                arr[0]=n2;

                mid++;
                while(mid< nums.length && nums[mid]==target){
                    n1=mid;
                    mid++;
                }
                arr[1]=n1;
                return arr;
            }else if(nums[mid] > target){
                right=mid-1;
            }else{
                left = mid +1;
            }
        }

        return new int[]{-1,-1};
    }
}

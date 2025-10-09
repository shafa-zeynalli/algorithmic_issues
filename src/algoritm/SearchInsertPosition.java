package algoritm;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};

        System.out.println(searchInsert(nums,2));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = (left+right)/2;

            if (nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return left;
    }

    public static int searchArr(int[] nums, int mid, int target) {

        if (nums[mid] == target){
            return mid;
        }else if(nums[mid]>target){
            int m = mid- mid/2;
            return searchArr(nums, m, target);
        }else if(nums[mid]<target){
            int m = mid+mid/2;
            return searchArr(nums, m, target);
        }else{
            return mid+1;
        }

        //return pivot;
    }


}

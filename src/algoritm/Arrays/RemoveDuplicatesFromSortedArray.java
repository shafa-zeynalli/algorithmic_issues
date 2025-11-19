package algoritm.Arrays;



//Two Pointers - Read/Write Pointer pattern
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int write=1;

        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[read-1]){
                nums[write] =nums[read];
                write++;
            }
        }
        return write;
    }

}

package algoritm.Sort;

//https://leetcode.com/problems/merge-sorted-array

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1,3,arr2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k=0;
        int[] arr1= new int[m];

        for (int l = 0; l < m; l++) {
            arr1[l]=nums1[l];
        }

        while (i<arr1.length && j<nums2.length){
            if (arr1[i]<nums2[j]) nums1[k++] = arr1[i++];
            else nums1[k++] = nums2[j++];
        }
        while (i<arr1.length){
            nums1[k++] = arr1[i++];
        }
        while (j<nums2.length){
            nums1[k++] = nums2[j++];
        }
    }
}

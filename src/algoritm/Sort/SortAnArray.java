package algoritm.Sort;



//https://leetcode.com/problems/sort-an-array

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
//        Arrays.sort(arr);
//        quickSort(arr,0, arr.length-1);


        mergeSort(arr);
    }

    //MergeSort
    public static void mergeSort(int[] arr) {
        if (arr.length<2) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i-mid]=arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    private static void merge(int[] arr, int[] left, int[] right){
        int i=0,j=0,k=0;

        while (i<left.length && j<right.length){
            if (left[i]<right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i< left.length) arr[k++] = left[i++];
        while (j< right.length) arr[k++] = right[j++];
    }


//QuickSort


//    public static void quickSort(int[] arr, int low, int high){
//        if (low<high){
//            int pivotI = partition(arr,low,high);
//            quickSort(arr,low,pivotI-1);
//            quickSort(arr,pivotI+1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high){
//        int pivot = arr[high];
//        int i=low-1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot){
//                i++;
//
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i]=temp;
//            }
//        }
//
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high]=temp;
//        return i+1;
//    }
}

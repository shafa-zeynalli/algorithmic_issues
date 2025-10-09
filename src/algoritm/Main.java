package algoritm;

import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {2,7,2,15};
//        twoSum(arr, 9);



        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};


//        System.out.println(isValid("([]{}"));
//        System.out.println(containsDuplicate(arr));
//        System.out.println(intersect(arr1,arr2));

        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        for (int i=0; i<=nums.length; i++){
            int finalI = i;
            if( !Arrays.stream(nums).anyMatch(num->num == finalI) ) return i;
        }
        return 0;
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> newMap = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        if (nums1.length ==0 || nums2.length==0) return new int[0];

        for (int i:nums1){
            newMap.put(i,(newMap.getOrDefault(i,0)+1));
        }
        for (int i:nums2){
            if (newMap.containsKey(i) && newMap.get(i)>0){
                list.add(i);
                newMap.put(i,(newMap.get(i)-1));
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }






    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int i=0; i< nums.length; i++){
            if (numbers.contains(nums[i])){
                return true;
            }else {
                numbers.add(nums[i]);
            }
        }
        return false;
    }





    public static boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            } else if (c=='}' || c==']' || c==')') {
                if (stack.isEmpty() || !matches(stack.pop(),c)) return false;
            }else return false;
        }

        return stack.isEmpty();
    }
    public static boolean matches(char open, char close){
        return (open=='(' && close == ')') ||
               (open=='{' && close == '}') ||
               (open=='[' && close == ']');
    }


//    public static boolean isValid(String s) {
//        Map<Character,Character> pairs = new HashMap<>();
//
//        pairs.put(')','(');
//        pairs.put('}','{');
//        pairs.put(']','[');
//
//        Deque<Character> stack = new ArrayDeque<>();
//
//        for (char c: s.toCharArray()){
//            if(pairs.containsValue(c)){
//                stack.push(c);
//            } else if (pairs.containsKey(c)) {
//                if (stack.isEmpty() || stack.pop() != pairs.get(c)) return false;
//            }else return false;
//        }
//
//        return stack.isEmpty();
//    }





    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> newMap = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            int num = target - nums[i];
            if (newMap.containsKey(num)){
                return new int[] { newMap.get(num), i};
            }
            newMap.put(nums[i], i);
        }

        return null;


//        sorted olunmush arr ucun
//        int left = 0, right = numbers.length -1;
//
//        while(left < right){
//            int sum = numbers[left] + numbers[right];
//
//            if(sum == target){
//                return new int[] {left + 1, right + 1};
//            }else if(sum < target){
//                left++;
//            }else right--;
//        }
//
//        return null;
    }
}

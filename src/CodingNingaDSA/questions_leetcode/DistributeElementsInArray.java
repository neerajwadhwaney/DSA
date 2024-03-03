package CodingNingaDSA.questions_leetcode;

import java.util.ArrayList;
import java.util.List;

public class DistributeElementsInArray {

//    Bruteforce approach
//    public static int graterCount(List<Integer> arr,int num){
//        int count =0;
//        for(int value:arr){
//            if(value>num)
//                count++;
//        }
//        return count;
//    }
//    public static int[] resultArray(int []nums){
//        List<Integer> arr1 = new ArrayList<>();
//        List<Integer> arr2 = new ArrayList<>();
//
//        arr1.add(nums[0]);
//        arr2.add(nums[1]);
//
//        for (int i = 2; i < nums.length; i++) {
//            int count1 = graterCount(arr1, nums[i]);
//            int count2 = graterCount(arr2, nums[i]);
//
//            if (count1 > count2) {
//                arr1.add(nums[i]);
//            } else if (count1 < count2) {
//                arr2.add(nums[i]);
//            } else {
//                if (arr1.size() > arr2.size()) {
//                    arr2.add(nums[i]);
//                } else {
//                    arr1.add(nums[i]);
//                }
//            }
//        }
//
//        int[] result = new int[arr1.size() + arr2.size()];
//        int index = 0;
//
//        for (int num : arr1) {
//            result[index++] = num;
//        }
//
//        for (int num : arr2) {
//            result[index++] = num;
//        }
//
//        return result;
//    }

//    Binary Search approach
    public static int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>(), arr2 = new ArrayList<>();
        ArrayList<Integer> arr1Sorted = new ArrayList<>(), arr2Sorted = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        arr1Sorted.add(nums[0]);
        arr2Sorted.add(nums[1]);

        for(int i=2; i<nums.length; i++){
            int val = nums[i];
            int pos1 = binarySearch(arr1Sorted, val), pos2 = binarySearch(arr2Sorted, val);
            int gc1 = arr1.size() - pos1;
            int gc2 = arr2.size() - pos2;

            if(gc1 > gc2){
                arr1.add(val);
                arr1Sorted.add(pos1, val);
            }

            else if(gc2 > gc1){
                arr2.add(val);
                arr2Sorted.add(pos2, val);
            }

            else{
                if(arr2.size() < arr1.size()){
                    arr2.add(val);
                    arr2Sorted.add(pos2, val);
                }
                else{
                    arr1.add(val);
                    arr1Sorted.add(pos1, val);
                }
            }
        }
        int i=0;
        for(int num : arr1){
            nums[i++] = num;
        }
        for(int num : arr2){
            nums[i++] = num;
        }
        return nums;
    }
    private  static int binarySearch(List<Integer> arr, int val){
        int left = 0;
        int right = arr.size() - 1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr.get(mid) <= val)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {47,104,11,37};
        int[] ans = resultArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

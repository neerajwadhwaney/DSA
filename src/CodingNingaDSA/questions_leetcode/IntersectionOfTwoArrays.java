package CodingNingaDSA.questions_leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1,int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num:nums2){
            if(set.contains(num)){
                ans.add(num);
                set.remove(num);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]= ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] res=intersection(nums1,nums2);
        for(int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }
}

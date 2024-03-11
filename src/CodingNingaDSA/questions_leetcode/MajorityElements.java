package CodingNingaDSA.questions_leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> frq = new HashMap<>();
        for(int num:nums){
            frq.put(num,frq.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:frq.entrySet()){
            if(entry.getValue()>(nums.length/2))
                return entry.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

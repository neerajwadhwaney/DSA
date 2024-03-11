package CodingNingaDSA.questions_leetcode;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public static String customSortString(String order,String s){
        Map<Character,Integer> frq = new HashMap<>();
        for(char c:s.toCharArray()){
            frq.put(c,frq.getOrDefault(c,0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(char c:order.toCharArray()){
            if(frq.containsKey(c)){
                int count = frq.get(c);
                while(count > 0){
                    result.append(c);
                    count--;
                }
                frq.remove(c);
            }
        }
        for(char c:s.toCharArray()){
            if(frq.containsKey(c)){
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String order="bcafg";
        String s="abcd";
        System.out.println(customSortString(order,s));
    }
}

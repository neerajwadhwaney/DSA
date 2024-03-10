package CodingNingaDSA.questions_leetcode;

import java.util.Arrays;

public class AppleRedistribution {
    public static int minBoxes(int[] apple,int[] capacity){
        int maxApples=0;
        for(int i=0;i< apple.length;i++){
            maxApples+=apple[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i= capacity.length-1;i>=0;i--){
            maxApples-=capacity[i];
            count++;
            if(maxApples<=0)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] apples={5,5,5};
        int[] capacity={2,4,2,7};
        System.out.println(minBoxes(apples,capacity));
    }
}

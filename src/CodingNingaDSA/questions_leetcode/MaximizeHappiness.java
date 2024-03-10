package CodingNingaDSA.questions_leetcode;

import java.util.Arrays;

public class MaximizeHappiness {
    public static long maximumHappiness(int[] happiness,int k){
        Arrays.sort(happiness);
        int l= happiness.length;
        long c=0,ans=0;
        int i=l-1;
        while(k>0){
            if(happiness[i]-c<0){
                return ans;
            }
            ans+=(long)happiness[i]-c;
            k--;
            c++;
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] happiness={1,2,3};
        System.out.println(maximumHappiness(happiness,2));
    }
}

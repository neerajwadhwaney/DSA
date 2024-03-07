package CodingNingaDSA.questions_leetcode;

public class GatherRainWater {
    public static int totalWater(int [] arr){
       int sum = 0;
       for(int i=1;i<arr.length-1;i++){

           int left=arr[i];
           for(int j=0;j<i;j++){
               left=Math.max(left,arr[j]);
           }

           int right=arr[i];
           for(int j=i+1;j<arr.length;j++){
               right=Math.max(right,arr[j]);
           }

           sum+=Math.min(left,right)-arr[i];
       }
       return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(totalWater(arr));
    }
}

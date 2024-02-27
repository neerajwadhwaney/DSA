package CodingNingaDSA.recursion;

public class DigitSum {
    public static int digitSum(int [] arr){
        if(arr.length <= 1)
            return arr[0];
        int [] brr = new int[arr.length-1];
        for(int i=0;i<brr.length;i++){
            brr[i] = arr[i+1];
        }
        return arr[0] + digitSum(brr);
    }

    public static void main(String[] args) {
        int [] arr = {9,8,9};
        System.out.println(digitSum(arr));
    }
}

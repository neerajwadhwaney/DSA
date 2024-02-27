package CodingNingaDSA.recursion;

public class CheckNumber {
    public static boolean isPresent(int []arr,int n){
        if(arr.length == 1){
            if(arr[0] == n)
                return true;
            else
                return false;
        }
        if(arr[0] == n)
            return true;
        int [] brr = new int[arr.length-1];
        for(int i=0;i<brr.length;i++){
            brr[i] = arr[i+1];
        }
        return isPresent(brr,n);
    }

    public static void main(String[] args) {
        System.out.println(isPresent(new int[]{9, 8, 10},2));
    }
}

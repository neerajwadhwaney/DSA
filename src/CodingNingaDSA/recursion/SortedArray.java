package CodingNingaDSA.recursion;

public class SortedArray {
    public static boolean isSorted(int [] arr){
        if(arr.length == 1 || arr.length == 0)
            return true;
        int [] brr = new int[arr.length-1];
        for(int i=0;i<brr.length;i++){
            brr[i] = arr[i+1];
        }
        boolean ans = isSorted(brr);
        if(!ans)
            return false;
        if(arr[0]<=arr[1])
            return true;
        else
            return false;
    }
    public static boolean isSorted_2(int [] arr){
        if(arr.length == 1 || arr.length == 0)
            return true;
        if(arr[0]>arr[1])
            return false;
        int [] brr = new int[arr.length-1];
        for(int i=0;i<brr.length;i++){
            brr[i] = arr[i+1];
        }
        boolean ans = isSorted_2(brr);
        return ans;
    }
//    without using extra space from start index to end
    private static boolean isSorted_3(int [] arr,int startIndex){
        if(startIndex >= arr.length-1)
            return true;
        if(arr[startIndex]>arr[startIndex+1])
            return false;
        return isSorted_3(arr,startIndex+1);
    }

    public static  boolean isSorted_3(int [] arr){
        return isSorted_3(arr,0);
    }

    public static void main(String[] args) {
        int [] arr={1,3,6,9};
        System.out.println(isSorted_3(arr));
    }
}

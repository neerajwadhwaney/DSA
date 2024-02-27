package CodingNingaDSA.recursion;

public class FirstIndex {
    private static int firstIndex(int [] arr,int key,int startIndex){
        if(startIndex == arr.length-1 && arr[startIndex]!=key)
            return -1;
        if(arr[startIndex] == key)
            return startIndex;
        return firstIndex(arr,key,startIndex+1);
    }

    public static int firstIndex(int [] arr,int key){
        return firstIndex(arr,key,0);
    }

    public static void main(String[] args) {
        int [] arr = {1,3,8,9,10};
        System.out.println(firstIndex(arr,11));
    }
}

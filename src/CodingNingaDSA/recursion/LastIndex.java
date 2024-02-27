package CodingNingaDSA.recursion;

public class LastIndex {
    private static int lastIndex(int [] arr,int key,int startIndex){
        if(startIndex == 0 && arr[startIndex] != key){
            return -1;
        }
        if(arr[startIndex] == key)
            return startIndex;
        return lastIndex(arr,key,startIndex-1);
    }
    public static int lastIndex(int [] arr,int key){
        return lastIndex(arr,key, arr.length-1);
    }

    public static void main(String[] args) {
        int [] arr= {1,6,8,10,5,6,8};
        System.out.println(lastIndex(arr,11));
    }
}

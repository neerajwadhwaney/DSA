package CodingNingaDSA.recursion;

import java.util.ArrayList;

public class AllIndexes {
    private static ArrayList<Integer> allIndexes(int [] arr,int key,ArrayList<Integer> frq,int startIndex){

        if (arr[startIndex] == key)
            frq.add(startIndex);
        if(startIndex == arr.length-1 )
            return frq;
        return allIndexes(arr,key,frq,startIndex+1);
    }

    public static ArrayList<Integer> allIndexes(int [] arr,int key){
        return allIndexes(arr,key,new ArrayList<Integer>(),0);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,8,9,0,8,5,8};
        System.out.println(allIndexes(arr,10));
    }
}

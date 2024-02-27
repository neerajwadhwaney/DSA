package CodingNingaDSA.SearchingSorting;

import java.util.Scanner;

public class BinarySearch {
//    Binary Search is defined as a searching algorithm
//    used in a sorted array by repeatedly dividing the
//    search interval in half. Works on the principle of
//    divide and conquer
//    Complexity:
//    best case:O(1)
//    avg case:O(logN)
//    worst case:O(logN)


//    recursive approach
    public static int binarySearch(int low,int hi,int arr[],int key){
        if(hi<low)
            return -1;
        int mid=(hi+low)/2;
        if(arr[mid]==key)
            return mid+1;
        else if(arr[mid]>key){
            hi=mid-1;
            return binarySearch(low,hi,arr,key);
        }
        else{
            low=mid+1;
            return binarySearch(low,hi,arr,key);
        }
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int x=kb.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter an sorted array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=kb.nextInt();
        System.out.println("Element is at:"+binarySearch(0,x-1,arr,key));
    }
}

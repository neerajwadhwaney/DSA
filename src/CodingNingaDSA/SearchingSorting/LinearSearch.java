package CodingNingaDSA.SearchingSorting;

import java.util.Scanner;

public class LinearSearch {
//    Linear Search is defined as a sequential search algorithm that
//    starts at one end and goes through each element of a list until
//    the desired element is found, otherwise the search continues
//    till the end of the data set.
//    complexity:
//    best case: O(1)
//    avg case: O(N)
//    worst case: O(N)
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the length of array");
        int x=kb.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println("enter the element to be searched");
        int key=kb.nextInt();
        System.out.println("element is at:"+linearSearch(arr,key));
    }
}

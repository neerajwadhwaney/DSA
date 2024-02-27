package CodingNingaDSA.SearchingSorting;

import java.util.Scanner;

public class Merge {
    public static int[] merge(int[] arr, int[] brr){
        int[] crr =new int[arr.length+ brr.length];
        int i,j,k;
        i=j=k=0;
        while(i<arr.length&&j<brr.length){
            if(arr[i]<brr[j]){
                crr[k]=arr[i];
                i++;
                k++;
            } else if (brr[j]<arr[i]) {
                crr[k]=brr[j];
                k++;
                j++;
            }
            else {
                crr[k]=arr[i];
                i++;
                k++;
            }
        }
        for(;k<crr.length;k++){
            if(i==arr.length){
                crr[k]=brr[j];
                j++;
            }
            else{
                crr[k]=arr[i];
                i++;
            }
        }
        return crr;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the length of the 2 arrays:");
        int x=kb.nextInt();
        int y=kb.nextInt();
        int[] arr=new int[x];
        int[] brr=new int[y];
        System.out.println("Enter the values for 1st array");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter the values for 2nd array");
        for(int i=0;i<brr.length;i++){
            brr[i]=kb.nextInt();
        }
        int [] crr= merge(arr,brr);
        for (int j : crr) {
            System.out.println(j);
        }
    }
}

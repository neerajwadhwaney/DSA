package CodingNingaDSA.SearchingSorting;

public class MergeSort {
    public static void mergeSort(int[] input, int low, int hi){
        if(low>=hi){
            return;
        }
        int mid=(hi+low)/2;
        mergeSort(input,low,mid);
        mergeSort(input,mid+1,low);
        merge(input,low,hi);
    }
    public static void merge(int[] input,int low,int hi){
        int[] crr =new int[hi-low+1];
        int mid=(low+hi)/2;
        int i=low,j=mid,k=0;

        while(i<=mid&&j<hi){
            if(input[i]<input[j]){
                crr[k]=input[i];
                i++;
                k++;
            } else if (input[j]<input[i]) {
                crr[k]=input[j];
                k++;
                j++;
            }
            else {
                crr[k]=input[i];
                i++;
                k++;
            }
        }
        for(;k<crr.length;k++){
            if(i==mid+1){
                crr[k]=input[j];
                j++;
            }
            else{
                crr[k]=input[i];
                i++;
            }
        }
        for(int x=0;x<crr.length;x++){
            input[low+x]=crr[x];
        }

    }

    public static void main(String[] args) {
        int[] arr ={10,70,30,50,90,60,20,100,40,80};
        mergeSort(arr,0,9);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}

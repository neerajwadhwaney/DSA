package CodingNingaDSA.SearchingSorting;

public class BasicSorting {
    public static int[]  bubbleSort(int [] arr){
//        time complexity:
//        best case = O(n)
//        worst case = O(n^2)
        for(int turn=0;turn<arr.length-1;turn++){
            int swaps=0;
            for(int j=0;j< arr.length-1-turn;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }

            }
            if(swaps==0){
                break;
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        arr=bubbleSort(arr);
        printArr(arr);
    }
}

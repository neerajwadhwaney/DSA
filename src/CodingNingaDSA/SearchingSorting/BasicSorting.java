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

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}

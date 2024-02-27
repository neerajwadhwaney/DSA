package CodingNingaDSA;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int sumEven=0;
        int sumOdd=0;
        int no=kb.nextInt();
        while(no%10!=0){
            if((no%10)%2==0){
                sumEven+=(no%10);
            }
            else{
                sumOdd+=(no%10);
            }
            no=no/10;
        }
        System.out.println(sumEven+" "+sumOdd);
    }
}

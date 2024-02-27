package CodingNingaDSA.intro;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt();
        int sum=0;
        for(int i=1;i<=x;i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}

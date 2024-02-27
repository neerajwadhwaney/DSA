package CodingNingaDSA.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}

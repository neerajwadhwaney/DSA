package CodingNingaDSA.Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package CodingNingaDSA.Patterns;

import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+i);
            }
            System.out.println();
        }
    }
}

package CodingNingaDSA.Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                System.out.print((char)('A'+i+j));

            }
            System.out.println();

        }
    }
}

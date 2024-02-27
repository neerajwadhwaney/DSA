package CodingNingaDSA.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt();
        for(int i=0;i<x;i++){
            for(int k=0;k<x-(i+1);k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
  output:
   *
  ***
 *****
*******
 */

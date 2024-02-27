package CodingNingaDSA.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt();
        for(int i=1;i<=x;i++){
            for(int k = 0; k<(2*x-2*i);k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(j+i);
            }
            System.out.println();
        }
    }
}
/*
output:
      1
    23
  345
4567
 */
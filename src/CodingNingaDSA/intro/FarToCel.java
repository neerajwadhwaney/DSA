package CodingNingaDSA.intro;

import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int start=kb.nextInt();
        int end=kb.nextInt();
        int jump=kb.nextInt();
        for(int i=start;i<=end;i+=jump){
            System.out.print(i);
            System.out.println("   "+((i-32)*5)/9);
        }
    }
}

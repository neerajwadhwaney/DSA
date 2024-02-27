package CodingNingaDSA.intro;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int base=kb.nextInt();
        int power=kb.nextInt();
        System.out.println(Math.pow(base,power));
    }
}

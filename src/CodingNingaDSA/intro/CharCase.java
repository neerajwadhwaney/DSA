package CodingNingaDSA.intro;

import java.util.Scanner;

public class CharCase {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        char a=kb.next().charAt(0);
        if(a>='A'&&a<='Z')
            System.out.println("upper case");
        else if (a>='a' && a<='z') {
            System.out.println("lower case");

        }
        else
            System.out.println("not a char");
    }
}

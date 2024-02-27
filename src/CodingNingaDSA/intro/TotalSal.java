package CodingNingaDSA.intro;

import java.util.Scanner;

public class TotalSal {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int sal=kb.nextInt();
        String ch=kb.next();
        int hra=20*sal/100;
        int da=50*sal/100;
        int pf=11*sal/100;
        switch (ch){
            case "A":
                System.out.println(sal+hra+da-pf+1700);
                break;
            case "B":
                System.out.println(sal+hra+da-pf+1500);
                break;
            default:
                System.out.println(sal+hra+da-pf+1300);

        }
    }
}

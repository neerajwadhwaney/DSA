package CodingNingaDSA.recursion;

public class Multiplication {
    public static int product(int a,int b){
        if(a == 0 || b == 0)
            return 0;
        if(b == 1)
            return a;
        return a+product(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(product(4,3));
    }
}

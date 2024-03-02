package CodingNingaDSA.stack;

import java.util.Stack;

public class TowerOfHanoi {
    public static void toh(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c){
       if(n > 0){
           toh(n-1,a,c,b);
           c.push(a.pop());
           toh(n-1, b,a,c);
       }
    }

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();

        for(int i = 1;i<=5;i++){
            a.push(i);
        }

        toh(5,a,b,c);
        System.out.println(c);
    }
}

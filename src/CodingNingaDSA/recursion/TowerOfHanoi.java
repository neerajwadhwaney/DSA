package CodingNingaDSA.recursion;

public class TowerOfHanoi {
    public static void toh(int n,String a, String b, String c){
        if(n>0){
            toh(n-1,a,c,b);
            System.out.println(a+" to "+c);
            toh(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        toh(3,"a","b","c");
    }
}

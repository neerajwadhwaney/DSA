package CodingNingaDSA.recursion;

public class CountZeros {
    public static int countZero(int n){
        if(n==0)
            return 1;
        if(n!=0 && n<10)
            return 0;
        if(n%10 == 0)
           return 1+countZero(n/10);
       return countZero(n/10);
    }

    public static void main(String[] args) {
        System.out.println(countZero( 708000));
    }
}

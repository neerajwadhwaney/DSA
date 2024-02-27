package CodingNingaDSA.recursion;

public class GeometricSum {
    public static double geometricSum(int k){
        if(k == 0)
            return 1;
        return 1/Math.pow(2,k)+geometricSum(k-1);
    }

    public static void main(String[] args) {
        System.out.println(geometricSum(4));
    }
}

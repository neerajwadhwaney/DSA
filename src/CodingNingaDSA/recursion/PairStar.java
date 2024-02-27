package CodingNingaDSA.recursion;

public class PairStar {
    public static String pairStar(String input){
        String ans="";
        if(input.length() == 2){
            if (input.charAt(0) == input.charAt(1)){
                return input.replace(input.charAt(0)+"",input.charAt(0)+"*");
            }
            else
                return input;
        }
        if (input.charAt(0) == input.charAt(1)){
            ans = input.charAt(0)+"*"+input.charAt(1);
        }
        return ans+pairStar(input.substring(1,input.length()));

    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);
    }
}

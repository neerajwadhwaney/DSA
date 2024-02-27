package CodingNingaDSA.recursion;

public class CheckPallindrome {
    public static boolean isPalindrome(String input){

        if(input.length()==1 || input.length()==0)
            return true;
        if(input.length()==2 || input.length()==3){
            if(input.charAt(0) == input.charAt(input.length()-1))
                return true;
            else
                return false;
        }
        if(input.charAt(0) == input.charAt(input.length()-1))
            return isPalindrome(input.substring(1,input.length()-1));
        else
            return false;
    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<=s.length()-1;i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                sb.append(s.charAt(i)+"");
            }
        }
        String input = sb.toString();

        System.out.println(input.toLowerCase());

        System.out.println(isPalindrome(input.toLowerCase()));
    }
}

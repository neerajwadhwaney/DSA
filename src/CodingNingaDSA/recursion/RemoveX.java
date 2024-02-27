package CodingNingaDSA.recursion;

public class RemoveX {
    public static String removeX(String input){
        if(!input.contains("x")){
            return input;
        }
        if(input.length()==1 && input.charAt(0)=='x'){
            return "";
        }
        if(input.charAt(input.length()-1)=='x'){
            input = input.substring(0,input.length()-1);
        }
        input = input.substring(0,input.indexOf('x')) + input.substring(input.indexOf('x')+1,input.length());
        return removeX(input);
    }

    public static void main(String[] args) {
        String str = "xx";
        System.out.println(removeX(str));
    }
}

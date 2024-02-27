package CodingNingaDSA.recursion;

public class StringToNum {
    private static int stringToNum(String input,int places,int startIndex){

        if(input.length()==1){
            return input.charAt(0) - 48;
        }
        return (input.charAt(0) - 48) * places + stringToNum(input.substring(startIndex+1,input.length()),places/10,0);
    }
     public static int stringToNum(String input){
        return stringToNum(input,(int)Math.pow(10,input.length()-1),0);
     }

    public static void main(String[] args) {
        String str = "12567";
        System.out.println(stringToNum(str));
    }
}

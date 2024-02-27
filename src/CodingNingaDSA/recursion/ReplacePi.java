package CodingNingaDSA.recursion;

public class ReplacePi {

    public static String replacePi(String input){
        if(!input.contains("pi")){
            return input;
        }
        input = input.replace("pi","3.14");
        return replacePi(input);
    }

    public static void main(String[] args) {
        String str = "pipi";
        System.out.println(replacePi(str));
    }
}

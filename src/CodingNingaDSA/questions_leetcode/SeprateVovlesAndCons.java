package CodingNingaDSA.questions_leetcode;

public class SeprateVovlesAndCons {
    public static void main(String[] args) {
        String text = "prachi";
        System.out.println("Original String: "+text);
        System.out.println("Separate consonants and vowels of the said string: "+validate(text));
        text = "JavaScript";
        System.out.println("\nOriginal String: "+text);
        System.out.println("Separate consonants and vowels of the said string: "+validate(text));
        text = "SQLite";
        System.out.println("\nOriginal String: "+text);
        System.out.println("Separate consonants and vowels of the said string: "+validate(text));
    }

    public static String validate(String text) {
        String text1 = text.replaceAll("(?i)[^aeiou]", "");
        String text2 = text.replaceAll("(?i)[aeiou]", "");
        return text2 + text1;
    }
}

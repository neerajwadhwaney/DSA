package CodingNingaDSA.questions_leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountSpecialCharTwo {
    public static int numberOfSpecialCharsTwo(String word) {
        Set<Character> charSet = new HashSet<>();

        for(int i=0; i<word.length(); i++) {
            int ch = word.charAt(i);
            if(word.contains((char)(ch-32)+"")){
                if( i<word.indexOf((char)(ch-32))){
                    charSet.add((char)(ch));
                } else if ( i>word.indexOf((char)(ch-32))) {
                    charSet.remove((char)ch);
                }
            }
        }
        return charSet.size();
    }



    public static void main(String[] args) {
        System.out.println(numberOfSpecialCharsTwo("aaAbcBC") );
    }
}

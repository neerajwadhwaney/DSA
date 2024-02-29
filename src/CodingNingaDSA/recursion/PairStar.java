package CodingNingaDSA.recursion;

public class PairStar {


    private static void addStars(StringBuilder sb, int idx,String str){


        if(idx == str.length()-1){
            sb.append(str.charAt(idx));
            return;
        }

        //kaam
        sb.append(str.charAt(idx));
        if(str.charAt(idx)==str.charAt(idx + 1)){
            sb.append("*");
        }
        addStars(sb, idx+1, str);
    }
    public static String addStars(String str){
        StringBuilder sb = new StringBuilder();
        addStars(sb,0,str);
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(addStars(str));
    }
}

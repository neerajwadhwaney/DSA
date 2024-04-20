package CodingNingaDSA.questions_leetcode;

public class WordSearch {

    public static boolean wordSearch(char[][] board, String word){
        int k=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(k)){
                    k++;
                }
            }
        }
        return k>=word.length();
    }

    public static void main(String[] args) {
        char[][] board = new char[3][4];
        board[0][0]='A';
        board[0][1]='B';
        board[0][2]='C';
        board[0][3]='E';
        board[1][0]='S';
        board[1][1]='F';
        board[1][2]='C';
        board[1][3]='S';
        board[2][0]='A';
        board[2][1]='D';
        board[2][2]='E';
        board[2][3]='E';
        System.out.println(wordSearch(board,"ABCCDF"));
    }
}

import java.util.Scanner;

public class backtrack {

    public static void subset(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        subset(str,ans+str.charAt(i),i+1);
        subset(str,ans,i+1);
    }

    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String temp=str.substring(0,i)+str.substring(i+1);
            permutation(temp,ans+ch);
        }
    }

    public static void nQueens(char board[][],int row){
        if(row==board.length){
            boardprint(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);
                board[row][j]='.';
            }
        }
    }

    public static boolean issafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void boardprint(char board[][]){
        System.out.println("-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int gridway(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }else if(i==n-1 || j==m-1){
            return 1;
        }
        int w1 = gridway(i+1,j,n,m);
        int w2 = gridway(i,j+1,n,m);
        return w1+w2;
    }

    public static boolean sudukosolver(int suduko[][],int row,int col){
        if(row==9){
            return true;
        }
        int nextrow = row;
        int nextcol = col+1;
        if(col+1==9){
            nextrow= row+1;
            nextcol=0;
        }

        if (suduko[row][col] != 0) {
            return sudukosolver(suduko, nextrow, nextcol);
        }
        for(int i=1;i<=9;i++){
            if(issafe(suduko,row,col,i)){
                suduko[row][col]=i;
                if(sudukosolver(suduko,nextrow,nextcol)){
                    return true;
                }
                suduko[row][col]=0;
            }
        }
        return false;
    }

    public static boolean issafe(int suduko[][],int row,int col,int digite){
        for(int i=0;i<=8;i++){
            if(suduko[row][i]==digite){
                return false;
            }
        }
        for(int i=0;i<=8;i++){
            if(suduko[i][col]==digite){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(suduko[i][j]==digite){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printsuduko(int sudoko[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  static void main(String[] args){
//        String str = "abc";
//        subset(str,"",0);
//        permutation(str,"");

//        int n=4;
//        char board[][]= new char[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                board[i][j] = '.';
//            }
//        }
//
//        nQueens(board,0);

//        int m=3;
//        int n=3;
//        System.out.println(gridway(0,0,n,n));

        int sudoku[][] = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if(sudukosolver(sudoku,0,0)){
            System.out.println("solution exists");
            printsuduko(sudoku);
        }else{
            System.out.println("solution not exists");
        }
    }
}

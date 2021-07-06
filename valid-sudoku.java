//https://leetcode.com/problems/valid-sudoku/
class Solution {
    public boolean cube(char[][] board,int a,int b) {
        
        HashSet<Character> v=new HashSet<Character>();
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                System.out.print(board[i][j]+" ");
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    if(!v.contains(board[i][j])){
                        v.add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }
            }
            System.out.println("");
        }
        return true;
    }
    public boolean row(char[][] board,int a) {
        HashSet<Character> v=new HashSet<Character>();
        for(int i=0;i<9;i++){
            if(board[i][a]=='.'){
                    continue;
            }
            else{
                if(!v.contains(board[i][a])){
                    v.add(board[i][a]);
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
    public boolean column(char[][] board,int a) {
        HashSet<Character> v=new HashSet<Character>();
        for(int i=0;i<9;i++){
            if(board[a][i]!='.'){
                if(!v.contains(board[a][i])){
                    v.add(board[a][i]);
                }
                else{
                    return false;
                }
                }
            
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        boolean t=true;
        for(int i=0;i<9;i++){
            if(t){
                t=row(board,i) && column(board,i);
            }
            else{
                return false;
            }
        }
        if(!t){
            return t;
        }
        int j=0;
        for(int i=0;i<9;i+=3){
            t=t && cube(board,i,j);
            t=t && cube(board,i,j+3);
            t=t && cube(board,i,j+6);
            if(!t){
                return t;
            }
        }
        return t;
    }
}
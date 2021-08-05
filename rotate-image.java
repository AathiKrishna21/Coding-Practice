//https://leetcode.com/problems/rotate-image/
class Solution {
    public void transpose(int[][] m,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=m[j][i];
                m[j][i]=m[i][j];
                m[i][j]=t;
            }
        }
    }
    public void mirror(int[][] m,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=m[i][n-j-1];
                m[i][n-j-1]=m[i][j];
                m[i][j]=t;
            }
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        transpose(matrix,n);
        mirror(matrix,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
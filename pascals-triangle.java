//https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a= new ArrayList<List<Integer>>();
        int i,j;
        for(i=0;i<n;i++){
            List<Integer> b= new ArrayList<Integer>();
            for(j=0;j<i+1;j++){
                if(j==0||j==i){
                    b.add(1);
                }
                else{
                    b.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
                }
            }
            a.add(b);
        }
        return a;
    }
}
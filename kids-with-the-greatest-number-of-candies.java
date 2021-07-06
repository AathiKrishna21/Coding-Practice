//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int max=-1,n=candies.length;
        List<Boolean> b=new ArrayList<Boolean>();
        for(int i=0;i<n;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+e>=max){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;
    }
}
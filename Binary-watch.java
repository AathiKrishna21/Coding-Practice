//https://leetcode.com/problems/binary-watch/
class Solution {
    public int cbit(int n){
        int count=0;
        while(n!=0){
            count++;
            n &= (n-1);
        }
        return count;
    }
    public void addlist(List<String> ans,int h,int m){
        String t=h+":";
        t=t+(m<10 ? "0"+m : m);
        // System.out.println(t);
        ans.add(t);
    }
    public List<String> readBinaryWatch(int n) {
        List<String> ans=new ArrayList<String>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(cbit(h)+cbit(m)==n){
                    addlist(ans,h,m);
                }
            }
        }
        return ans;
    }
}
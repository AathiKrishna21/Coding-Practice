//https://leetcode.com/problems/count-primes/
class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n<3){
            return 0;
        }
        boolean[] a=new boolean[n];
        for(int i=2;i<n;i++){
            if(!a[i]){
                count++;
            }
            for(int j=2;i*j<n;j++){
                a[j*i]=true;
            }
        
        }
        return count;
    }
}
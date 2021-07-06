//https://leetcode.com/problems/number-of-1-bits/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count++;
            System.out.println(n);
            n &= (n-1);
        }
        return count;
    }
}
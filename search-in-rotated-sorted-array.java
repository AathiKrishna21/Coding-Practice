//https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n<2){
            return (nums[0]==target) ? 0 : -1;
        }
        else{
            int s=0,m=n/2;
            for(int i=n/2;i<n;i++){
                if(nums[s]==target){
                    return s;
                }
                else if(nums[m]==target){
                    return m;
                }
                s++;
                m++;
            }
            return -1;
        }
    }
}
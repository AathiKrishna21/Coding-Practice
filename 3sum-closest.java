//https://leetcode.com/problems/3sum-closest/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int d=Integer.MAX_VALUE,n=nums.length;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int t=nums[i]+nums[r]+nums[l];
                
                if(t==target){
                    return t;
                }
                else{
                    if(d>=Math.abs(target-t)){
                        d=Math.abs(target-t);
                        sum=t;
                    }
                    if(t<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return sum;
    }
}
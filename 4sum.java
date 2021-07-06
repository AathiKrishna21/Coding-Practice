//https://leetcode.com/problems/4sum
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> a= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i,l,r,j,n=nums.length;
        if(n<4){
            return a;
        }
        for(i=0;i<n-3;i++){
            j=i+1;
            l=j+1;
            r=n-1;
            while(j<n-2){
                
                int t=nums[i]+nums[j]+nums[r]+nums[l];
                if(l<r && t==target){
                    List<Integer> b=new ArrayList<Integer>();
                    b.add(nums[i]);
                    b.add(nums[j]);
                    b.add(nums[l]);
                    b.add(nums[r]);
                    
                    if(!a.contains(b)){
                        a.add(b);
                    }
                    l++;
                    while(l<r && nums[l-1]==nums[l]){
                        l++;
                    }
                }
                else if(l<r &&target>t){
                    l++;
                    while(l<r && nums[l-1]==nums[l]){
                        l++;
                    }
                }
                else if(l<r &&t>target){
                    r--;
                    while(l<r && nums[r+1]==nums[r]){
                        r--;
                    }
                }
                else{
                    j++;
                    l=j+1;
                    r=n-1;
                }
            }
        }
        return a;
    }
}
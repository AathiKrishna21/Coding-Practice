class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        
        int n=nums.length;
        Arrays.sort(nums);
        if(n<=2){
            return a;
        }
        else{
            for(int i=0;i<n;i++){
                int left=i+1;
                int right=n-1;
                while(left<right){
                    int temp=nums[i]+nums[left]+nums[right];
                    if(temp==0){
                        List<Integer> l=new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        System.out.println(l+" ");
                        if(!a.contains(l))
                        a.add(l);
                        left++;
                        while(nums[left]==nums[left-1]&&left<right){
                            left++;
                        }
                    }
                    else if(temp>0){
                        right--;
                        while(nums[right]==nums[right+1]&&left<right){
                            right--;
                        }
                    }
                    else{
                        left++;
                        while(nums[left]==nums[left-1]&&left<right){
                            left++;
                        }
                    }
                }
                
            }
        }
        return a;
    }
}
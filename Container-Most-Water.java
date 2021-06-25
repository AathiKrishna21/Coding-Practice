class Solution {
    public int maxArea(int[] height) {
        int i,j,n=height.length;
        i=0;
        j=n-1;
        int max=0;
        while(i<j){
                // System.out.println(Math.min(height[i],height[j])*(j-i));
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));
                if(height[j]>height[i]){
                    i++;
                }
                else{
                    j--;
                }
            
        }
        return max;
    }
}
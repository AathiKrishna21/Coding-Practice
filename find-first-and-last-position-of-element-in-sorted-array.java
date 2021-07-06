//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int a=binary(nums,0,n-1,target);
        int b=a;
        if(a!=-1){
            while(a>0 && nums[a-1]==target){
                a--;
            }
            while(b<n-1 && nums[b+1]==target){
                b++;
            }
        }
        int[] c={a,b};
        return c;
    }
    public int binary(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binary(arr, l, mid - 1, x);
            return binary(arr, mid + 1, r, x);
        }
        return -1;
    }

}
//https://leetcode.com/problems/can-place-flowers/
class Solution {
    public boolean back(int[] flowerbed, int i){
        int n=flowerbed.length;
        if(n==1 ){
            return true;
        }
        else if(i==0 ){
            if(flowerbed[i+1]==0){
                flowerbed[i]=1;
                return true;
            }
            else{
                return false;
            }
        }
        else if(i==n-1){
            if(flowerbed[i-1]==0){
                flowerbed[i]=1;
                return true;
            }
            else{
                return false;
            }
        }
        else if(flowerbed[i+1]==0 && flowerbed[i-1]==0){
            flowerbed[i]=1;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && back(flowerbed,i)){
                count++;
            }
        }
        if(count>=n){
            return true;
        }
        return false;
    }
}
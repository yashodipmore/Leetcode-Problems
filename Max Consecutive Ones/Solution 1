class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount =0;
        int currCount =0;

        for(int element :nums){
            if(element ==0){
                if(maxCount<currCount){
                    maxCount = currCount;
                }
                currCount =0;
            }
            else{
                currCount++;
            }
        }
        return maxCount >currCount ? maxCount : currCount;
        
    }
}

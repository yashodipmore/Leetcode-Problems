class Solution {
    public int countWays(List<Integer> nums) {
        int selectCount = 0, sz = nums.size(), ways = 0;
        nums.sort(null);
        if(nums.get(0) != 0) 
        ways++;

        for(int ind = 0; ind <sz; ind++){
            selectCount++;

            if(nums.get(ind) < selectCount){
                if(ind + 1 <sz && selectCount < nums.get(ind+1)){
                    ways++;
                }
                if(ind + 1 == sz){
                    ways++;
                }
            }
        }
        return ways;
    }
    
}

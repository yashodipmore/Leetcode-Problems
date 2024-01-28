class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pref1 =1;
        int mx1 = Integer.MIN_VALUE;
        int pref2 = 1;
        int mx2 = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            if(pref1 == 0) {
                pref1 = nums[i];
            }
            else{
                pref1 = pref1 * nums[i];
            }
            mx1 = Math.max(mx1,pref1);
        }

         for(int i =n -1; i>=0; i--){
            if(pref2 == 0) {
                pref2 = nums[i];
            }
            else{
                pref2 = pref2 * nums[i];
            }
            mx2 = Math.max(mx2,pref2);
        }
        return Math.max(mx1,mx2);
    }
}

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
          return 0;
        }

        int[] y0 = new int[2];
        int[] y1 = new int[2];
        y1[0] = nums[0];

        for (int i = 1; i < n; i++){
            y0 [i % 2] = Math.max(y0[(i-1) % 2], y1[(i -1) %2]);
            y1[i % 2] = y0[(i -1) %2] + nums[i];

        }
        return Math.max(y0[(n-1) % 2], y1[(n - 1) % 2]);
    }
}

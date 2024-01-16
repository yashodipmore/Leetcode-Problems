class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int n= grid.length;
        boolean[] v= new boolean [n*n+1];
        int sum =0;
        int val;
        for(int i=0; i<n*n;i++){
            val = grid[i/n][i%n];
            if(v[val]){
                result[0]= val;
            }else{
                v[val] = true;
                sum+=val;
            }
        }
        int N = n*n;
        result[1] = ((N*(N+1))/2- sum);
        return result;
    }
}

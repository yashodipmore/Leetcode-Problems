class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;


        for(int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(num));
        }

        int count = 0;
        for(int num : nums) {
            if(frequencyMap.getOrDefault(num,0) == maxFrequency) {
                count++;
            }
        }
        return count;
    }
}

public class Solution {
    public int minSteps(String s, String t) {
        int[] countX = new int[26];
        int[] countY = new int[26];

        for (char ch : s.toCharArray()) {
            countX[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            countY[ch - 'a']++;
        }

        int steps = 0;
        for (int i = 0; i < 26; i++) {
            steps += Math.abs(countX[i] - countY[i]);
        }

        return steps / 2;  
    }
}

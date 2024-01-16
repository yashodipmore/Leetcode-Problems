

public class Solution {
    public boolean halvesAreAlike(String y) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');

        int vowelsCount = 0;
        int midIndex = y.length() / 2;

        for (int i = 0; i < midIndex; i++) {
            char charA = y.charAt(i);
            char charB = y.charAt(midIndex + i);
            if (vowels.contains(charA)) vowelsCount++;
            if (vowels.contains(charB)) vowelsCount--;
        }

        return vowelsCount == 0;
    }
}


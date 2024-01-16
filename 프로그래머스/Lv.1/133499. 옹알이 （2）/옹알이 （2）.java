import java.util.HashMap;

class Solution {
    public int solution(String[] babbling) {
        HashMap<Character, String> words = createWordsMap();
        int answer = 0;

        for (String s : babbling) {
            char prev = '\u0000';
            int i = 0;

            while (i < s.length()) {
                if (prev == s.charAt(i)) {
                    break;
                }

                String word = words.getOrDefault(s.charAt(i), "");

                if (word.isEmpty()) {
                    break;
                }

                String curStr = s.substring(i, Math.min(s.length(), i + word.length()));

                if (curStr.equals(word)) {
                    prev = s.charAt(i);
                    i += word.length();
                } else {
                    break;
                }
            }

            if (i == s.length()) {
                answer++;
            }
        }

        return answer;
    }

    private HashMap<Character, String> createWordsMap() {
        HashMap<Character, String> words = new HashMap<>();
        words.put('a', "aya");
        words.put('y', "ye");
        words.put('w', "woo");
        words.put('m', "ma");
        return words;
    }
}

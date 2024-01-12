import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char cur = keymap[i].charAt(j);
                keypad.putIfAbsent(cur, Integer.MAX_VALUE);  // 기존에 없는 경우 최대값으로 초기화
                int idx = keypad.get(cur);
                keypad.put(cur, Math.min(idx, j + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for (char cur : target.toCharArray()) {
                if (keypad.containsKey(cur)) {
                    count += keypad.get(cur);
                } else {
                    flag = false;
                    break;
                }
            }

            answer[i] = flag ? count : -1;
        }

        return answer;
    }
}

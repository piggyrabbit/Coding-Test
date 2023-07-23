import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> set = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            if (set.containsKey(array[i])) {
                set.put(array[i], set.get(array[i]) + 1);
            }
            else {
                set.put(array[i], 1);
            }
        }
        
        int max = 1;
        
        for (int value : set.values()) {
            if (value > max) max = value;
        }
        
        int num = 0;
        
        int cnt = 0;
        
        for (int value : set.values()) {
            if (value == max) num++;
            if (num == 0) cnt++;
        }
        
        int cnt2 = 0;
        
        for (int key : set.keySet()) {
            cnt2++;
            if (cnt + 1 == cnt2) answer = key;
        }
        
        if (num > 1) answer = -1;
        
        return answer;
    }
}
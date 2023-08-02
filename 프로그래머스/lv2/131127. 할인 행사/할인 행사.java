import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> temp = new HashMap<>();
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                temp.put(e.getKey(), e.getValue());
            }
            
            for (int j = i; j < i + 10; j++) {
                if (temp.get(discount[j]) == null) {
                    temp.put(discount[j], -1);
                }
                else {
                    temp.put(discount[j], temp.get(discount[j]) - 1);
                }
            }
            
            int cnt = 0;
            
            for (Map.Entry<String, Integer> e : temp.entrySet()) {
                if (e.getValue() == 0) cnt++;    
            }
            
            if (cnt == want.length) answer++;
        }
        
        return answer;
    }
}
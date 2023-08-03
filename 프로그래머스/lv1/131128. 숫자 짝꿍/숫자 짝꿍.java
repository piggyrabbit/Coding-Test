import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < X.length(); i++) {
            int num = Integer.parseInt(X.charAt(i)+"");
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 0; i < Y.length(); i++) {
            int num = Integer.parseInt(Y.charAt(i)+"");
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 9; i >= 0; i--) {
            String num = i+"";
            int cnt = 0;
            
            if (map.get(i) != null && map2.get(i) != null) {
                cnt = Math.min(map.get(i), map2.get(i));
            }
            
            answer += num.repeat(cnt);
        }
        
        if (answer.length() == 0) answer = "-1";
        else if (answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}
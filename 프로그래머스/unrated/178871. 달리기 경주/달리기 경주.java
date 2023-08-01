import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        // 선수 이름, 인덱스
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String str : callings) {
            
            // 추월한 선수의 현재 순위
            int idx = map.get(str);
            
            // 추월당할 선수의 이름
            String temp = players[idx - 1];
            
            map.put(str, idx - 1);
            map.put(temp, idx);
            
            players[idx - 1] = str;
            players[idx] = temp;
        }
        
        return players;
    }
}
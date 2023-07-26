import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        // 배열에 길이 1 단위로 시작점을 담음
        // 그게 두 개 이상인 거 개수 셈
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        
        System.out.println(map);
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) answer++;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        // hashmap 만들어서 종류별로 몇 개 있는지 세기
        // 그것들로 경우의 수 구함
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            if (map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
            } else {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
        }
        answer = 1;
        
        // 1개만 선택할 때부터 map.size() 개수만큼 선택할 때까지 모든 경우의 수 구함
        for (int key : map.values()) {
            answer *= key + 1;
        }
        
        return answer - 1;        
    }
}
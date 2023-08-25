import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }
        
        int max = 0;
        int key = 0;
        
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
            if (max < map.get(i)) {
                max = map.get(i);
                key = i;
            }
        }
        
        answer = max;
        
        return answer;
    }
}
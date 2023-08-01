import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        
        int max = 0;
        
        for (int value : map.values()) {
            if (max < value) max = value;
        }
        
        System.out.println(max);
        
        for (int key : map.keySet()) {
            if (map.get(key) == max && answer == 0) {
                answer = key;
            }
            else if (map.get(key) == max && answer != 0) {
                answer = -1;
            }
        }
        
        
        return answer;
    }
}



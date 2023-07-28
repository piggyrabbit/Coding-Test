import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            }
            else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        
        
        
        int cnt = 0;
        
        ArrayList<Character> list = new ArrayList<>();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        
        char[] arr = new char[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] + "";
        }
        
        return answer;
    }
}
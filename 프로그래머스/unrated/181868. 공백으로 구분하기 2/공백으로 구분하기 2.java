import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        String[] arr = my_string.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String str : operations) {
            String[] arr = str.split(" ");
            int num = Integer.parseInt(arr[1]);
            
            if (arr[0].equals("I")) {
                list.add(num);
                Collections.sort(list);
            }
            if (str.equals("D -1")) {
                if (list.size() != 0) list.remove(0);
            }
            if (str.equals("D 1")) {
                if (list.size() != 0) list.remove(list.size() - 1);
            }
            
        }
        
        if (list.size() != 0) {
            answer[0] = list.get(list.size() - 1);
            answer[1] = list.get(0);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String str = "" + i;
            
            if (!str.contains("1") && !str.contains("2") && !str.contains("3") && !str.contains("4")
               && !str.contains("6") && !str.contains("7") && !str.contains("8") && !str.contains("9")) {
                answer.add(i);
            }
            
            
        }
        
        if (answer.size() == 0) answer.add(-1);
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (char ch : my_string.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                answer.add(ch - '0');
            }
        }
        
        int[] ans = new int[answer.size()];
        
        
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        
        Arrays.sort(ans);
        
        
        return ans;
    }
}
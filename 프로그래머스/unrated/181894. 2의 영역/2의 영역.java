import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                answer.add(2);
                
                int idx = 0;
                
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] == 2) {
                        idx = j;
                    }
                }
                
                if (idx != 0) {
                    for (int p = i + 1; p <= idx; p++) {
                        answer.add(arr[p]);
                    }
                    
                    
                }
                
                
                break;
            }
        }
        
        if (answer.size() == 0) answer.add(-1);
        return answer;
    }
}
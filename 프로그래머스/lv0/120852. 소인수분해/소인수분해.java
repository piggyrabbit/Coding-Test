import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        HashSet<Integer> answer = new HashSet<>();
        
        while(n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    answer.add(i);
                    n /= i;
                    break;
                }
            }
        }
        
        int[] result = new int[answer.size()];
        
        Iterator iter = answer.iterator();
        
        int idx = 0;
        
        while(iter.hasNext()) {
            result[idx] = (int) iter.next();
            idx++;            
        }
        
        Arrays.sort(result);
        
        return result;
    }
}
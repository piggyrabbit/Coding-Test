import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = (n+"").split("");
        
        Arrays.sort(str);
        
        String strr = "";
        
        for (int i = str.length - 1; i >= 0; i--) {
            strr += str[i];
        }
        
        answer = Long.parseLong(strr);
        
        return answer;
    }
}
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] str = (n+"").split("");
        
        for (String string : str) {
            answer += Integer.parseInt(string);
        }
        return answer;
    }
}
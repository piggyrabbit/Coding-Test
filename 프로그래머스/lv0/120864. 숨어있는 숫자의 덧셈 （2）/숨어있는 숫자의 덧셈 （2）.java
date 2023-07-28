import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                String str = "" + ch;
                while(i < my_string.length()) {
                    i++;
                    
                    if (i < my_string.length() && my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                        str += my_string.charAt(i);
                    }
                    else break;
                }
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_str, int n) {
        
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i++) {
            if (i+n < my_str.length()) {
                answer.add(my_str.substring(i, i+n));
                i += n - 1;
            }
            else if (i + n >= my_str.length()) {
                answer.add(my_str.substring(i, my_str.length()));
                break;
            }
        }
        
        return answer;
    }
}
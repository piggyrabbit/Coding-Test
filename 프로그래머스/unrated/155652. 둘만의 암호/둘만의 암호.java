import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        char[] arr = s.toCharArray();
        char[] skipArr = skip.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < index; j++) {
                arr[i] = (char)(arr[i] + 1);
                if (arr[i] > 'z') arr[i] = 'a';
                
                for (int p = 0; p < skipArr.length; p++) {
                    if (arr[i] == skipArr[p]) {
                        j--;
                        break;
                    }
                }
            }
        }
        
        
        String answer = new String(arr);
        
        return answer;
    }
}
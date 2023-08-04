class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        
        String[] arr = s.split("");
        
        int numP = 0;
        int numY = 0;
        
        for (String str : arr) {
            if (str.equals("p")) numP++;
            if (str.equals("y")) numY++;
        }
        
        if (numP == numY) answer = true;
        else answer = false;
        
        return answer;
    }
}
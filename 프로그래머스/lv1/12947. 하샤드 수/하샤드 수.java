class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = x + "";
        
        int tmp = 0;
        
        for (int i = 0; i < str.length(); i++) {
            tmp += Integer.parseInt(str.charAt(i) + "");
        }
        
        if (x % tmp == 0) answer = true;
        else answer = false;
        
        return answer;
    }
}
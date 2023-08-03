class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = "";
        
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch == 'A') ch = 'B';
            else if (ch == 'B') ch = 'A';
            
            str += ch;
        }
        
        System.out.println(str);
        
        if (str.contains(pat)) answer = 1;
        
        return answer;
    }
}
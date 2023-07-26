class Solution {
    public String solution(int age) {
        String answer = "" + age;
        
        String str = "";
        
        for (int i = 0; i < answer.length(); i++) {
            str += (char)(answer.charAt(i) - '0' + 'a');
        }
        
        return str;
    }
}
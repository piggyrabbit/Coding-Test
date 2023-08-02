class Solution {
    public int solution(double flo) {
        int answer = 0;
        
        String str = flo + "";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            
            if(str.charAt(i) == '.') break;
            
            result += str.charAt(i);
        }
        
        answer = Integer.parseInt(result);
        
        return answer;
    }
}
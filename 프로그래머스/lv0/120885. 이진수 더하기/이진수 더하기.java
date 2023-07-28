class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int total = 0;
        
        for (int i = bin1.length() - 1; i >= 0; i--) {
            int mul = 1;
            
            for (int j = 0; j < bin1.length() - i - 1; j++) {
                mul *= 2;
            }
            
            total += (int)(bin1.charAt(i) - '0') * mul;
            
        }
        
        for (int i = bin2.length() - 1; i >= 0; i--) {
            int mul = 1;
            
            for (int j = 0; j < bin2.length() - i - 1; j++) {
                mul *= 2;
            }
            
            total += (int)(bin2.charAt(i) - '0') * mul;
            
        }
        
        System.out.println(total);
        
        int start = 0;
        
        for (int i = 10; i >= 0; i--) {
            if (total / Math.pow(2, i) >= 1) {
                total -= Math.pow(2, i);
                answer += "1";
                start = 1;
            }
            else if (start == 1) {
                answer += "0";
            }
        }
        
        if (answer.equals("")) answer = "0";
        
        return answer;
    }
}
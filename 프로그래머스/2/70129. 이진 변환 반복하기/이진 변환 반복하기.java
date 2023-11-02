class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(true) {
            if (s.equals("1")) break;
            
            int length = s.length();
            
            s = s.replaceAll("0", "");
            
            length = length - s.length();
            
            answer[1] += length;
            
            length = s.length();
            
            String binary = decimalToBinary(length);
            
            s = binary;
            
            answer[0]++;
        }
        
        return answer;
    }
    
    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }
        
        return binary.toString();
    }

}
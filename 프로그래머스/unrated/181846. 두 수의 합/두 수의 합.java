import java.util.*;
import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger bigNumber = new BigInteger(a);
        BigInteger bigNumber2 = new BigInteger(b);
        
        answer = bigNumber.add(bigNumber2).toString();
        
        return answer;
    }
}
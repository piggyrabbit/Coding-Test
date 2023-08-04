import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while(n != 1) {
            if (n % 2 == 0) n /= 2;
            else if (n % 2 == 1 && n != 1) n = 3 * n + 1;
            
            list.add(n);
        }
        
        return list;
    }
}
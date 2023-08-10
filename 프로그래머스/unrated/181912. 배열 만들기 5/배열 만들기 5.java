import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i].substring(s, s+l);
            int tmp = Integer.parseInt(str);
            
            if (tmp > k) list.add(tmp);
        }
        
        return list;
    }
}
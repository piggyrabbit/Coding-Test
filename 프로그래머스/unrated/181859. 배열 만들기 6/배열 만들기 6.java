import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i = i + 0) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            }
            else {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size()-1);
                    i++;
                }
                else {
                    stk.add(arr[i]);
                    i++;
                }
            }
            
        }
        
        if (stk.size() == 0) stk.add(-1);
        
        
        return stk;
    }
}
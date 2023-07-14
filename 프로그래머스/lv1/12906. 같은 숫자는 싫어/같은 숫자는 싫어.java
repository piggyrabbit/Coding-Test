import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty() == true) {
                stk.push(arr[i]);
            }
            else if (stk.peek() != arr[i]) {
                stk.push(arr[i]);
            }
        }
        
        return stk.stream().mapToInt(i -> i).toArray();
    }
}
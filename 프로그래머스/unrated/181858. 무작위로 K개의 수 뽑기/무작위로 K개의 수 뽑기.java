import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (answer.size() == 0) answer.add(arr[i]);
            else {
                boolean exists = false;
                
                for (int j = 0; j < answer.size(); j++) {
                    if (answer.get(j) == arr[i]) exists = true;
                }
                
                if (exists == false) answer.add(arr[i]);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            if (i < answer.size()) {
                result.add(answer.get(i));
            }
            else {
                result.add(-1);
            }
        }
        
        return result;
    }
}
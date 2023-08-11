import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (flag[i]) {
                for (int j = 0; j < temp; j++) {
                    list.add(temp);
                }
                
                for (int j = 0; j < temp; j++) {
                    list.add(temp);
                }
            }
            else if (!flag[i]) {
                for (int j = 0; j < temp; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        
        return list;
    }
}
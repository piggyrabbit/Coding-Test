import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int max = 99999;
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) == max) {
                if (array[i] < array[answer]) answer = i;
            }
            if (Math.abs(array[i] - n) < max) {
                answer = i;
                max = Math.abs(array[i] - n);
            }
        }
        
        
        return array[answer];
    }
}
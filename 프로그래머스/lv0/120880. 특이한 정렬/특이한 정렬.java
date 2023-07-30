import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numlist, int n) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            answer.add(numlist[i]);
        }
        
        Collections.sort(answer, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                if (Math.abs(num1 - n) != Math.abs(num2 - n)) {
                    return Integer.compare(Math.abs(num1 - n),Math.abs(num2 - n));
                } else {
                    return Integer.compare(num2, num1);
                }
            }
            
        });
        
        return answer;
    }
}
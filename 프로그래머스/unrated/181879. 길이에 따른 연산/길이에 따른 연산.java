class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int total = 0;
        int multiply = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                total += num_list[i];        
            }
            else {
                multiply *= num_list[i];
            }
        }
        if (total == 0) {
            answer = multiply;
        } else {
            answer = total;
        }
        
        return answer;
    }
}
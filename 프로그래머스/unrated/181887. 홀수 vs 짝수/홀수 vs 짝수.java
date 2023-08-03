class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int total1 = 0;
        int total2 = 0; 
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) total1 += num_list[i];
            else total2 += num_list[i];
        }
        
        answer = Math.max(total1, total2);
        
        return answer;
    }
}
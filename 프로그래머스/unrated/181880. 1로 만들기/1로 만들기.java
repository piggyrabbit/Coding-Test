class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            
            while(true) {
                if (num == 1) break;
                if (num % 2 == 0) {
                    num/=2;
                    answer++;
                }
                else if (num % 2 == 1) {
                    num = (num - 1)/2;
                    answer++;
                }
            }
        }
        return answer;
    }
}
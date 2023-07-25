class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int num1 = 0;
        int num2 = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                num2++;
            }    
            else num1++;
        }
        answer[0] = num2;
        answer[1] = num1;
        
        return answer;
    }
}
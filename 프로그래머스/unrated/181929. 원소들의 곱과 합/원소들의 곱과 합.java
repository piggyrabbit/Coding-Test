class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int mul = 1;
        int mul2 = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            mul2 += num_list[i];
        }
        
        mul2 *= mul2;
        
        if (mul < mul2) answer = 1;
        
        return answer;
    }
}
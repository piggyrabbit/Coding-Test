class Solution {
    public int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        // 배열의 각 값들이 +, -일 경우 (즉 숫자마다 2개의 경우의 수)의 sum을 구함, 그 sum이 target과 일치하면 answer++;
        
        calculate(numbers, target, 0);
        
        return answer;
    }
    
    public int calculate(int[] numbers, int target, int index) {
        
        if (index == numbers.length) {
            if (target == 0) {
                answer++;
            } else {
                answer += 0;
            }
        } else {
            calculate(numbers, target - numbers[index], index + 1);
            calculate(numbers, target + numbers[index], index + 1);
        }
        
        return 0;
        
    }
}
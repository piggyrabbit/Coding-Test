import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 주어진 배열에서 서로 다른 3개의 수를 선택하기 위한 조합 구하기
        ArrayList<Integer> combination = new ArrayList<>();
        generateCombination(nums, 0, 3, combination, 0);

        // 조합 중 소수인 경우를 찾아서 카운트
        for (int sum : combination) {
            if (isPrime(sum)) {
                answer++;
            }
        }

        return answer;
    }

    // 조합을 구하는 함수
    private void generateCombination(int[] nums, int start, int count, ArrayList<Integer> combination, int currentSum) {
        if (count == 0) {
            combination.add(currentSum);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            generateCombination(nums, i + 1, count - 1, combination, currentSum + nums[i]);
        }
    }

    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

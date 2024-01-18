import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Set<Integer> winNumSet = new HashSet<>();
        for (int num : win_nums) {
            winNumSet.add(num);
        }

        int zeroCount = 0;
        int matchCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winNumSet.contains(num)) {
                matchCount++;
            }
        }

        // 최고 순위 계산
        int maxRank = 7 - (matchCount + zeroCount);
        answer[0] = Math.min(6, maxRank);

        // 최저 순위 계산
        int minRank = 7 - matchCount;
        answer[1] = Math.min(6, minRank);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] result1 = solution.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");  // Expected: [3, 5]

        int[] result2 = solution.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");  // Expected: [1, 6]

        int[] result3 = solution.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");  // Expected: [1, 1]
    }
}

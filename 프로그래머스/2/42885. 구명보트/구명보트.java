import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 사람들을 몸무게 순으로 정렬합니다.
        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스
        int boatCount = 0; // 필요한 구명보트 개수

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                // 가장 가벼운 사람과 가장 무거운 사람이 함께 탈 수 있다면 함께 탑승
                left++;
                right--;
            } else {
                // 가장 무거운 사람만 탈 수 있는 경우
                right--;
            }
            boatCount++;
        }

        return boatCount;
    }
}
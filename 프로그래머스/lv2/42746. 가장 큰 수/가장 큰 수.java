import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // 숫자 배열을 문자열 배열로 변환
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // ab와 ba를 비교하여 큰 순서대로 정렬
                return (b + a).compareTo(a + b);
            }
        });

        // 0으로만 구성된 배열인 경우 예외 처리
        if (arr[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자열을 이어붙여 결과 반환
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}

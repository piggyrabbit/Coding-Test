import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int idx = query[i];

            if (i % 2 == 0) {
                // 짝수 인덱스: 뒷부분을 자른다
                if (idx < arr.length) {
                    arr = Arrays.copyOfRange(arr, 0, idx + 1);
                }
            } else {
                // 홀수 인덱스: 앞부분을 자른다
                if (idx < arr.length) {
                    arr = Arrays.copyOfRange(arr, idx, arr.length);
                }
            }
        }

        return arr;
    }
}
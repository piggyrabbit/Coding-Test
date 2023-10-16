class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int max = -1;
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (max == -1) max = arr[j];
                    else {
                        if (max > arr[j]) max = arr[j];
                    }
                }
            }
            answer[i] = max;
            max = -1;
        }
        
        return answer;
    }
}
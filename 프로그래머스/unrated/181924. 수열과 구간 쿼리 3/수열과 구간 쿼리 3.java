class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            
            int tmp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = tmp;
        }
        
        answer = arr;
        
        return answer;
    }
}
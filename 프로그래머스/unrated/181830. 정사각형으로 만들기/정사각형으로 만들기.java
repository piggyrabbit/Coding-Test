class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int max = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > max) max = arr[i].length;
        }
        
        answer = new int[max][max];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
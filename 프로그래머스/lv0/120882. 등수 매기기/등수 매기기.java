class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        int[] sum = new int[score.length];
        
        int max = 0;
        
        for (int i = 0; i < score.length; i++) {
            sum[i] = 0;
            
            for (int j = 0; j < score[i].length; j++) {
                sum[i] += score[i][j];    
            }
            
            if (max < sum[i]) max = sum[i];
        }
        
        System.out.println(max);
        
        int cnt = 1;
        
        
        for (int i = max; i >= 0; i--) {
            int num = 0;
            for (int j = 0; j < sum.length; j++) {
                if (sum[j] == i) {
                    answer[j] = cnt;
                    num++;
                }
            }
            cnt = cnt + num;
        }
        
        
        return answer;
    }
}
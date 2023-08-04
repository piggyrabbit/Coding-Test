class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        double[] result = new double[N];
        
        for (int i = 0; i < answer.length; i++) {
            int cleared = 0;
            int arrived = 0;
            for (int j = 0; j < stages.length; j++) {
                int stage = stages[j] - 1;
                
                if (i < stage) {
                    cleared++;
                    arrived++;
                }
                else if (i == stage) {
                    arrived++;
                }
            }
            
            result[i] = (arrived-cleared) / (double)arrived * 1.0;
            
            System.out.println(result[i]);
        }
        
        int cnt = 0;
        
        while(true) {
            if (cnt == N) break;
            
            double max = -1;
            int idx = -1;
            
            for (int i = 0; i < result.length; i++) {
                if (max < result[i]) {
                    max = result[i];
                    idx = i;
                }   
            }
            if (idx != -1) {
                answer[cnt] = idx + 1;
                result[idx] = -1.0;   
            }
            if (idx == -1) {
                answer[cnt] = cnt + 1;
            }
            
            cnt++;
        }
        
        return answer;
    }
}
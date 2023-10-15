class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            
            for (int j = 0; j < my_string.length(); j++) {
                if (j < idx1 || j > idx2) {
                    answer += my_string.charAt(j);
                }
                if (j == idx1) {
                    
                    for (int k = idx2; k >= idx1; k--) {
                        answer += my_string.charAt(k);
                    }
                }
            }
            
            my_string = answer;
            answer = "";
        }
        
        answer = my_string;
        
        return answer;
    }
}
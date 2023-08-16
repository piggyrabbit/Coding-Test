class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            my_string = my_string.substring(0, indices[i])
                + my_string.substring(indices[i] + 1, my_string.length());
            
            for (int j = 0; j < indices.length; j++) {
                if (indices[j] >= idx) indices[j]--;
            }
        }
        
        answer = my_string;
        return answer;
    }
}
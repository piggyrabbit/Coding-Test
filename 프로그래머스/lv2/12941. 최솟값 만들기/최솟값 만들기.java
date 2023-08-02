import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        
        Integer[] C = new Integer[B.length];
        
        for (int i = 0; i < C.length; i++) {
            C[i] = B[i];
        }
        
        Arrays.sort(C, Collections.reverseOrder());
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * C[i];
        }
        
        return answer;
    }
}
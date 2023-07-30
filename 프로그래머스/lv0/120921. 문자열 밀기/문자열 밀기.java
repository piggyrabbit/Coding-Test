class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        if (A.equals(B)) return 0;
        
        for (int i = 1; i < A.length(); i++) {
            String last = A.substring(A.length() - 1, A.length());
            A = last + A.substring(0, A.length() - 1);
            
            System.out.println(A);
            if (A.equals(B)) return i;
        }
        
        return answer;
    }
}
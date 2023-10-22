class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Double pp = Double.parseDouble(p);
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String str = t.substring(i, i+p.length());
            System.out.println(str);
            Double strr = Double.parseDouble(str);
            
            if (strr <= pp) answer++;
        }
        return answer;
    }
}
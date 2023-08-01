class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        
        // 카드뭉치 하나 골라 카드를 순서대로 사용
        // 한 번 사용한 카드는 재사용 불가능
        // 순서 변경 불가능
        
        int idx1 = 0;
        int idx2 = 0;
        
        int idxGoal = 0;
        
        int cnt = 0;
        while(true) {
            if (idxGoal >= goal.length) {
                answer = "Yes";
                break;
            }
            cnt++;
            
            if (cnt > 30) break;
            
            if (idx1 < cards1.length && cards1[idx1].equals(goal[idxGoal])) {
                idx1++;
                idxGoal++;
            }
            else if (idx2 < cards2.length && cards2[idx2].equals(goal[idxGoal])) {
                idx2++;
                idxGoal++;
            }
        }
        
        return answer;
    }
}
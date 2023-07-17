import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Queue<Integer> que = new LinkedList<>();
        
        for (int i= 0; i < progresses.length; i++) {
            que.add(progresses[i]);
        }
        
        int cnt = 0;
        
        int progress = 0;
        
        int index = 0;
        
        while(true) {
            if (que.isEmpty()) break;
            
            if (que.peek() +  cnt * speeds[index] >= 100) {
                que.remove();
                index++;
                progress++;
                while(true) {
                    if (que.isEmpty()) break;
                    if (que.peek() + cnt * speeds[index] >= 100) {
                        que.remove();
                        index++;
                        progress++;
                    }
                    else {
                        break;
                    }
                }
            }
            if (progress > 0) {
                result.add(progress);
                progress = 0;
            }
            
            cnt++;
            
        }
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
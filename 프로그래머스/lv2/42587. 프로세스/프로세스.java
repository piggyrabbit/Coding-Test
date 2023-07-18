import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> loc = new LinkedList<>();
        PriorityQueue<Integer> pri = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            que.add(priorities[i]);
            loc.add(i);
            pri.add(priorities[i]);
            
        }

        System.out.println("pri:"+pri.peek());

        int cnt = 0;
        
        while(!que.isEmpty()) {
            if (que.peek() != pri.peek()) {
                que.add(que.peek());
                loc.add(loc.peek());
                
                que.remove();
                loc.remove();
            }
            else if (que.peek() == pri.peek()) {
                cnt++;
                
                if(loc.peek() == location) {
                    break;
                }
                que.remove();
                loc.remove();
                pri.remove();
                
                System.out.println(cnt);
            }
        }
        
        answer = cnt;
        
        return answer;
    }
}
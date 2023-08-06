import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] maps) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        
        // 바다 방문 처리
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (maps[i].charAt(j) == 'X') visited[i][j] = true;
            }
        }
        
        // x, y좌표, 숫자 합
        Queue<int[]> queue = new LinkedList<>();
        
        while(true) {
            int cnt = 0;
            int idxX = 0;
            int idxY = 0;
            
            for (int i = 0; i < visited.length; i++) {
                for (int j = 0; j < visited[i].length; j++) {
                    if (visited[i][j] == false) {
                        cnt++;
                        idxX = i;
                        idxY = j;
                    }
                }
            }
            // 모두 방문했으면 break;
            if (cnt == 0) break;
            
            // 시작점 추가
            queue.add(new int[]{idxX, idxY, Integer.parseInt(maps[idxX].charAt(idxY)+"")});
            
            visited[idxX][idxY] = true;
            
            int[] dx = {0, 0, 1, -1};
            int[] dy = {1, -1, 0, 0};
            
            int total = 0;
            
            int tmp = 0;
            
            while(!queue.isEmpty()) {
                int[] start = queue.poll();
                
                int startX = start[0];
                int startY = start[1];
                total = start[2];
                
                System.out.println(startX + " " + startY + " " + total);
                
                tmp += Integer.parseInt(maps[startX].charAt(startY)+"");
                
                for (int i = 0; i < 4; i++) {
                    // 변화된 startX나 startY가 사이즈 밖에 나가지 않아야 하고
                    // 방문된 노드는 방문하지 않아야 함
                    if (startX + dx[i] >= 0 && startX + dx[i] < maps.length &&
                       startY + dy[i] >= 0 && startY + dy[i] < maps[0].length() &&
                       visited[startX + dx[i]][startY + dy[i]] == false) {
                        visited[startX + dx[i]][startY + dy[i]] = true;
                        queue.add(new int[]{startX + dx[i], startY + dy[i], total +
                        Integer.parseInt(maps[startX + dx[i]].charAt(startY + dy[i])+"")});
                    }
                }
                
            }
            
            answer.add(tmp);
        }
        
        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i) == 0) answer.remove(i);
        }
        
        if (answer.size() == 0) answer.add(-1);
        
        Collections.sort(answer);
        
        return answer;
    }
}
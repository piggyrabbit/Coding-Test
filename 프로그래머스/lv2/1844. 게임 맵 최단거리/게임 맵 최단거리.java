import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 방문 여부를 저장하는 배열
        boolean[][] visited = new boolean[n][m];

        // 시작 위치와 이동한 칸의 개수를 함께 큐에 저장
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        int answer = -1;

        // 이동할 수 있는 방향 배열
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int cnt = current[2];

            if (x == n - 1 && y == m - 1) {
                answer = cnt;
                break;
            }

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny, cnt + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        return answer;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, C;
	static int[][] map, deltas= {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
	static boolean flag;
	static boolean[][] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		visit = new boolean[R][C];
		for (int r=0;r<R;r++) {
			st = new StringTokenizer(br.readLine());
			for (int c=0;c<C;c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		int ans = 0;
		for (int r=0;r<R;r++) {
			for (int c=0;c<C;c++) {
				if (!visit[r][c]) {
					flag = true;
					dfs(r, c);
					if (flag) ans++;
				}
			}
		}
		System.out.println(ans);
	}
	
	static void dfs(int r, int c) {
		for (int d=0;d<8;d++) {
			int nr = r+deltas[d][0];
			int nc = c+deltas[d][1];
			if (isIn(nr, nc)) {
				if (map[r][c]<map[nr][nc]) flag = false;
				if (!visit[nr][nc] && map[r][c]==map[nr][nc]) { // 같은 높이라면
					visit[nr][nc] = true; // 방문체크 후
					dfs(nr, nc); // 탐색
				}
			}
		}
		return;
	}
	
	static boolean isIn(int nr, int nc) {
		return nr>=0 && nr<R && nc>=0 && nc<C;
	}
}
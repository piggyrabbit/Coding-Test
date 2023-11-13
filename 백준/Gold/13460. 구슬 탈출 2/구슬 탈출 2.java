import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class State {
    int rx, ry, bx, by, depth;

    public State(int rx, int ry, int bx, int by, int depth) {
        this.rx = rx;
        this.ry = ry;
        this.bx = bx;
        this.by = by;
        this.depth = depth;
    }
}

public class Main {
    static int N, M;
    static char[][] board;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거

        board = new char[N][M];

        int rx = 0, ry = 0, bx = 0, by = 0;

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            board[i] = line.toCharArray();

            if (line.contains("R")) {
                rx = i;
                ry = line.indexOf("R");
            }

            if (line.contains("B")) {
                bx = i;
                by = line.indexOf("B");
            }
        }

        int result = bfs(rx, ry, bx, by);
        System.out.println(result);
    }

    static int bfs(int rx, int ry, int bx, int by) {
        boolean[][][][] visited = new boolean[N][M][N][M];
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(rx, ry, bx, by, 1));
        visited[rx][ry][bx][by] = true;

        while (!queue.isEmpty()) {
            State state = queue.poll();

            if (state.depth > 10) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nrx = state.rx, nry = state.ry, nbx = state.bx, nby = state.by;

                while (board[nrx + dx[i]][nry + dy[i]] != '#' && board[nrx][nry] != 'O') {
                    nrx += dx[i];
                    nry += dy[i];
                }

                while (board[nbx + dx[i]][nby + dy[i]] != '#' && board[nbx][nby] != 'O') {
                    nbx += dx[i];
                    nby += dy[i];
                }

                if (board[nbx][nby] != 'O') {
                    if (board[nrx][nry] == 'O') {
                        return state.depth;
                    }

                    if (nrx == nbx && nry == nby) {
                        int rDist = Math.abs(nrx - state.rx) + Math.abs(nry - state.ry);
                        int bDist = Math.abs(nbx - state.bx) + Math.abs(nby - state.by);

                        if (rDist > bDist) {
                            nrx -= dx[i];
                            nry -= dy[i];
                        } else {
                            nbx -= dx[i];
                            nby -= dy[i];
                        }
                    }

                    if (!visited[nrx][nry][nbx][nby]) {
                        visited[nrx][nry][nbx][nby] = true;
                        queue.add(new State(nrx, nry, nbx, nby, state.depth + 1));
                    }
                }
            }
        }

        return -1;
    }
}

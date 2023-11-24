import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //방향회전 수
    static int N;
    //50,50에서 시작
    static boolean[][] map = new boolean[51][51];

    static int[] moveX = {0,-1,1,0,-1,1};
    static int[] moveY = {1,1,1,-1,-1,-1};
    //방향회전 -> 점 방문
    static int[][] availableMove = {{2,1},{0,4},{5,0},{4,5},{1,3},{3,2}};
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map[25][25] = true;
        seeking(0,3,25,24);
        System.out.println(answer);
    }

    public static void seeking(int count, int pastMove, int x, int y){
        if(map[y][x]){
            if(count == N){
                answer++;
            }
            return;
        }
        if(count == N) return;
        map[y][x] = true;
        for(int i=0; i<2; i++){
            seeking(count+1, availableMove[pastMove][i], x+moveX[availableMove[pastMove][i]], y+moveY[availableMove[pastMove][i]]);
        }
        map[y][x] = false;
    }

}
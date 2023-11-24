import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int K; //start point
    static int[][] map;
    static int[][] dp;
    static int bp;
    static int answer = 99999;

    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        bp = (1<<N)-1;
        dp = new int[bp+1][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                if(i==j) {
                    map[i][j] = 999999;
                    st.nextToken();
                }
                else map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS(K);
        for(int i=0; i<N; i++){
            answer = Math.min(answer, dp[bp][i]);
        }
        System.out.println(answer);
    }

    public static void BFS(int init){
        Queue<SpaceShip> q = new LinkedList<>();
        q.add(new SpaceShip(1<<init,init,0));
        
        //dp 초기화
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<N; j++){
                dp[i][j] = 999999999;
            }
        }


        while (!q.isEmpty()){
            SpaceShip cur = q.poll();
            
            //다 돌았으면 얘는 종료
            if(cur.route == bp){
                continue;
            }

            int nextRoute;
            for(int i=0; i<N; i++){
                //자기 자신으로 반복은 X
                if(i == cur.start) continue;

                nextRoute = cur.route | (1<<i);
                
                if(dp[nextRoute][i] > map[cur.start][i] + cur.times){
                    dp[nextRoute][i] = map[cur.start][i] + cur.times;
                    q.add(new SpaceShip(nextRoute,i,dp[nextRoute][i]));
                }
            }
        }
    }
}

class SpaceShip{
    int route;
    int start;
    int times;
    //지나온 경로, 출발점, 누적 시간
    public SpaceShip(int r, int d, int t){
        this.route = r;
        this.start = d;
        this.times = t;
    }
}
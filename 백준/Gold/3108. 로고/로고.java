
import java.io.*;
import java.util.*;

public class Main {

    //start point = 0,0
    //PU (점 내리기)의 횟수 구하기
    //만약 직사각형이 겹치지 않음 -> 손올리기 -> 손내리기 해야함
    //직사각형이 겹치는 경우 -> 한붓그리기 가능

    static int N;
    static int[][] squares;
    static boolean[] drawed;
    static boolean[][] crossed;
    static int answer = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        squares = new int[N+1][4];
        int x1,x2,y1,y2;


        for(int i=1; i<N+1; i++){
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            if(x1 > x2){
                squares[i][0] = x2;
                squares[i][2] = x1;
            }else {
                squares[i][0] = x1;
                squares[i][2] = x2;
            }
            if(y1 > y2){
                squares[i][1] = y2;
                squares[i][3] = y1;
            }else {
                squares[i][1] = y1;
                squares[i][3] = y2;
            }
        }
        drawed = new boolean[N+1];
        crossed = new boolean[N+1][N+1];

        for(int i=0; i<N+1; i++){
            for(int j=i+1; j<N+1; j++){
                if(isDest(i,j)){
                    crossed[i][j] = true;
                    crossed[j][i] = true;
                }

            }
        }
        Wu(0);
        System.out.println(answer);

    }

    public static void Wu(int init){
        Queue<Integer> q = new LinkedList<>();
        q.add(init);
        drawed[init] = true;
        int cur;

        while(!q.isEmpty()){
            cur = q.poll();
            for(int i=1; i<N+1; i++){
                if(crossed[cur][i] && !drawed[i]){
                    q.add(i);
                    drawed[i] = true;
                }
            }
        }

        for(int i=0; i<N+1; i++){
            //안칠한애 나옴
            if(!drawed[i]){
                answer++;
                Wu(i);
                return;
            }
        }
    }

    public static boolean isDest(int cur, int next){
        if(squares[next][2] < squares[cur][0]) return false;
        if(squares[next][3] < squares[cur][1]) return false;
        if(squares[next][0] > squares[cur][2]) return false;
        if(squares[next][1] > squares[cur][3]) return false;
        if(squares[next][0] > squares[cur][0] && squares[next][2] < squares[cur][2]
                && squares[next][1] > squares[cur][1] && squares[next][3] < squares[cur][3]) return false;
        if(squares[next][0] < squares[cur][0] && squares[next][2] > squares[cur][2]
                && squares[next][1] < squares[cur][1] && squares[next][3] > squares[cur][3]) return false;


        return true;
    }
}
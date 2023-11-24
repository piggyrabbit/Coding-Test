import java.io.*;
import java.util.*;

public class Main {


    static int N, M;
    static int[] cycleParent;
    static int[] cycleRank;

    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cycleParent = new int[N];
        cycleRank = new int[N];

        for (int i=0; i<N; i++){
            cycleParent[i] = i;
        }

        int a, b;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(union(a,b)){
                answer = i+1;
                break;
            }
        }
        System.out.println(answer);
    }

    public static int find(int idx){
        if(cycleParent[idx] != idx){
            cycleParent[idx] = find(cycleParent[idx]);
        }
        return cycleParent[idx];
    }

    public static boolean union(int a, int b){
        a = find(a);
        b = find(b);

        if(a == b) return true;

        //낮은걸 높은쪽에 추가
        if(cycleRank[a] < cycleRank[b]){
            cycleParent[a] = b;
        }
        else{
            //a에 b추가
            cycleParent[b] = a;
            if(cycleRank[a] == cycleRank[b]){
                cycleRank[a]++;
            }
        }
        return false;
    }
}
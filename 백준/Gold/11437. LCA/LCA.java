import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    //root 1
    static int N;
    static int M;
    static Node[] nodes;
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        nodes = new Node[N+1];

        for(int i=0; i<N+1; i++){
            nodes[i] = new Node(99999);
        }
        //root
        nodes[1].depth=0;

        int i1, i2;
        for(int i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            i1 = Integer.parseInt(st.nextToken());
            i2 = Integer.parseInt(st.nextToken());
            nodes[i1].linkedNodes.add(i2);
            nodes[i2].linkedNodes.add(i1);
        }

        BFS();

        M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            i1 = Integer.parseInt(st.nextToken());
            i2 = Integer.parseInt(st.nextToken());

            answer.add(LCA(i1, i2));
        }

        for (int ans: answer) {
            System.out.println(ans);
        }
    }

    //루트부터 BFS를 해서 각 노드들의 depth, 부모 결정 가능
    public static void BFS(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while(!q.isEmpty()){
            int curNum = q.poll();
            Node cur = nodes[curNum];

            for(int childs : cur.linkedNodes){
                if(nodes[childs].depth > cur.depth){
                    nodes[childs].depth = cur.depth+1;
                    nodes[childs].parent = curNum;
                    q.add(childs);
                }
            }
        }
    }

    public static int LCA(int a, int b){
        int aDepth = nodes[a].depth;
        int bDepth = nodes[b].depth;

        if(aDepth != bDepth){
            while(aDepth > bDepth){
                a = nodes[a].parent;
                aDepth--;
            }

            while(aDepth < bDepth){
                b = nodes[b].parent;
                bDepth--;
            }
        }

        while(a != b){
            a = nodes[a].parent;
            b = nodes[b].parent;
        }
        return a;
    }
}

class Node{
    int depth;
    int parent;
    ArrayList<Integer> linkedNodes = new ArrayList<>();

    public Node(int depth){
        this.depth = depth;
    }
}
import java.io.*;
import java.util.*;

public class Main {


    static int F;
    static HashMap<String, Integer> friendNum;
    static ArrayList<Integer> friendParentNum;
    static ArrayList<Integer> friendSize;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            F = Integer.parseInt(br.readLine());
            int idx = 0;
            friendNum = new HashMap<>();
            friendParentNum = new ArrayList<>();
            friendSize = new ArrayList<>();

            for(int j=0; j<F; j++){
                st = new StringTokenizer(br.readLine());

                String fA = st.nextToken();
                String fB = st.nextToken();
                int fAidx, fBidx;

                if(!friendNum.containsKey(fA)){
                    friendNum.put(fA, idx);
                    friendSize.add(idx, 1);
                    friendParentNum.add(idx,idx);
                    idx++;
                }

                if(!friendNum.containsKey(fB)){
                    friendNum.put(fB, idx);
                    friendSize.add(idx, 1);
                    friendParentNum.add(idx,idx);
                    idx++;
                }

                fAidx = friendNum.get(fA);
                fBidx = friendNum.get(fB);

                System.out.println(union(fAidx, fBidx));
            }
        }
    }

    public static int find(int idx){
        if(friendParentNum.get(idx) == idx){
            return idx;
        }
        friendParentNum.set(idx, find(friendParentNum.get(idx)));
        return friendParentNum.get(idx);
    }

    public static int union(int a, int b){
        a = find(a);
        b = find(b);

        //둘이 다른 경우
        if(a != b) {
            //a에 b추가
            friendSize.set(a, friendSize.get(a) + friendSize.get(b));
            friendParentNum.set(b,a);
        }
        return friendSize.get(a);
    }
}
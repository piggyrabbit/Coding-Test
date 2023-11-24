import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static long[] words;
    static long defaultAlphabet = (1<<26)-1;
    static long alphabet;
    static ArrayList<Integer> answers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        words = new long[N];

        for(int i=0; i<N; i++){
            words[i] = exChangeBit(br.readLine());
        }

        //비트 다 1로
        alphabet = defaultAlphabet;

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            //forget
            if(Integer.parseInt(st.nextToken()) == 1){
                alphabet = alphabet & defaultAlphabet - (1 << st.nextToken().charAt(0)-97);
            }
            //remember
            else{
                alphabet = alphabet | (1 << st.nextToken().charAt(0)-97);
            }
            checkWord();
        }

        for(int ans : answers){
            System.out.println(ans);
        }
    }

    public static long exChangeBit(String s){
        long word = 0;
        for(char c : s.toCharArray()){ //소문자는 96부터
            word = word | (1 << (c-97));
        }
        return word;
    }

    public static void checkWord(){
        int answer = 0;
        for(long word : words){
            if((alphabet & word) == word){
                answer++;
            }
        }
        answers.add(answer);
    }
}

import java.io.*;
import java.util.*;

public class Main {


    static int N, M;
    static HashMap<String, Integer> words = new HashMap<>();
    static int count=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {

            wordMake(br.readLine(), sb);
            if(words.containsKey(sb.toString())){
                words.put(sb.toString(), words.get(sb.toString())+1);
            }else {
                words.put(sb.toString(),1);
            }
            sb.setLength(0);
        }
        M = Integer.parseInt(br.readLine());

        for (int i=0; i<M; i++){
            System.out.println(parseWord(br.readLine()));
        }
    }

    public static int parseWord(String sentence){
        StringTokenizer st = new StringTokenizer(sentence);
        StringBuilder sb = new StringBuilder();
        int answer = 1;

        while (st.hasMoreTokens()){
            wordMake(st.nextToken(), sb);
            count = 0;

            if(words.containsKey(sb.toString())){
                count = words.get(sb.toString());
            }

            sb.setLength(0);
            answer = answer * count;
        }

        return answer;
    }
    public static StringBuilder wordMake(String word, StringBuilder sb){
        int len = word.length();

        sb.append(word.charAt(0));
        if(len >= 2){
            sb.append(word.charAt(word.length()-1));

            if(len >= 3){
                char[] a = word.substring(1, word.length()-1).toCharArray();
                Arrays.sort(a);
                sb.append(a);
            }
        }
        return sb;
    }

}
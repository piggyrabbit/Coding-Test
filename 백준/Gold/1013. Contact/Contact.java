import java.io.*;
import java.util.*;

public class Main {


    static int N;
    static String no = "NO";
    static String yes = "YES";

    //패턴 : (100+1+ | 01) + -> 정규식 사용!!!!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            if(parser(br.readLine())){
                System.out.println(yes);
            }else{
                System.out.println(no);
            }
        }

    }

    public static boolean parser(String s){
        String pattern = "^(01|10(0+1+))+$";
        boolean val = s.matches(pattern);
        return val;
    }
}
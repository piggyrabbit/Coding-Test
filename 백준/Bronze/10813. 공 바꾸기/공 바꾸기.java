import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str;
		
		str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int i, j, k, temp;
		
		int[] ball = new int[n];
		
		for (int w = 0; w < n; w++) {
			ball[w] = w + 1;
		}
		
		for (int p = 0; p < m; p++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken());
			j = Integer.parseInt(str.nextToken());
			
			temp = ball[i-1];
			ball[i - 1] = ball[j - 1];
			ball[j - 1] = temp;
		}
		
		for (int e = 0; e < n; e++) {
			bw.write(ball[e] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

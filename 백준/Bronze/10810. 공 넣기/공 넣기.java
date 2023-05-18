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
		
		int i, j, k;
		
		int[] ball = new int[n];
		
		for (int w = 0; w < n; w++) {
			ball[w] = 0;
		}
		
		for (int p = 0; p < m; p++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken());
			j = Integer.parseInt(str.nextToken());
			k = Integer.parseInt(str.nextToken());
			
			for (int q = i - 1; q <= j - 1; q++) {
				ball[q] = k;
			}
		}
		
		for (int e = 0; e < n; e++) {
			bw.write(ball[e] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

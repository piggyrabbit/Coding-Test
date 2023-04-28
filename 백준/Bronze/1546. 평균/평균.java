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
		
		str = new StringTokenizer(br.readLine());
		
		int[] score = new int[n];
		 
		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(str.nextToken());
		}
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		
		float sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += (float)score[i]/max*100;
		}
		
		bw.write((float)sum/n + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}

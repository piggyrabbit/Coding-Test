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
		
		int a, b, n;
		int numm = 0;
		String string;
		
		n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		
		str = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(str.nextToken());
		}
		
		int check = Integer.parseInt(br.readLine());
		
		for (int p = 0; p < n; p++) {
			if (num[p] == check) {
				numm++;
			}
		}
		
		bw.write(numm + "\n");
		br.close();
		bw.flush();
		bw.close();
	}

}

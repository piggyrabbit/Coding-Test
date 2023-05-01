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
		
		int n;
		int max = 0;
		int num = 0;
		
		for (int i = 0; i < 9; i++) {
			n = Integer.parseInt(br.readLine());
			if (max < n) {
				max = n;
				num = i + 1;
			}
		}
		bw.write(max + "\n" + num);
		
		br.close();
		bw.flush();
		bw.close();
	}

}

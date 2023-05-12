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

		int count = 0;
		
		int[] student = new int[28];
		int[] std = new int[30];
		
		for (int i = 0; i < 28; i++) {
			student[i] = Integer.parseInt(br.readLine());
		}
		
		for (int p = 0; p < 30; p++) {
			std[p] = p + 1;
		}
		
		for (int i = 0; i < 28; i++) {
			for (int j = 0; j < 30; j++) {
				if (student[i] == std[j]) {
					std[j] = 0;
				}
			}
		}
		
		for (int i = 0; i < 30; i++) {
			if (std[i] != 0) {
				bw.write(std[i] + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

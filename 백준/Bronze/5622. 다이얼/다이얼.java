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

		String str = br.readLine();

		char[] ch = str.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'C') {
				sum += 3;
			}
			if (ch[i] >= 'D' && ch[i] <= 'F') {
				sum += 4;
			}
			if (ch[i] >= 'G' && ch[i] <= 'I') {
				sum += 5;
			}
			if (ch[i] >= 'J' && ch[i] <= 'L') {
				sum += 6;
			}
			if (ch[i] >= 'M' && ch[i] <= 'O') {
				sum += 7;
			}
			if (ch[i] >= 'P' && ch[i] <= 'S') {
				sum += 8;
			}
			if (ch[i] >= 'T' && ch[i] <= 'V') {
				sum += 9;
			}
			if (ch[i] >= 'W' && ch[i] <= 'Z') {
				sum += 10;
			}
		}

		bw.write(sum + "\n");
		br.close();
		bw.flush();
		bw.close();
	}

}

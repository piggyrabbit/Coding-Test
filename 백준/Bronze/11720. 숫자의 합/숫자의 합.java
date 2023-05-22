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
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		char[] ch = str.toCharArray();
		
		int sum = 0;
		
		for (int i = 0; i < ch.length; i++) {
			sum += ch[i] - '0';
		}
		
		bw.write(sum + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}

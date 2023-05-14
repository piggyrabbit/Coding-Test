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
		String str;
		
		
		int num = Integer.parseInt(br.readLine());
		char[] ch;
		
		for (int i = 0; i < num; i++) {
			str = br.readLine();
			ch = str.toCharArray();
			bw.write(ch[0] + "" + ch[ch.length - 1] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

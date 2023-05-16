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
		
		
		String s = br.readLine();
		
		char[] ch = s.toCharArray();
		
		for (int i = 'a'; i <= 'z'; i++) {
			int exists = 0;
			
			for (int p = 0; p < ch.length; p++) {
				if (ch[p] == i) {
					bw.write(p + "");
					exists = 1;
					break;
				}
			}
			if (exists == 0) {
				bw.write("-1");
			}
			if(i != 'z') {
				bw.write(" ");
			}
		}
		
		bw.write("\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}

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
		int r;
		String s, ss;
		String[] temp = null;
		char[] tt = null;
		
		for (int i = 0; i < n; i++) {
			ss = br.readLine();
			temp = ss.split(" ");
			r = Integer.parseInt(temp[0]);
			s = temp[1];
			tt = s.toCharArray();
			
			for (int p = 0; p < tt.length; p++) {
				for (int k = 0; k < r; k++) {
					System.out.print(tt[p]);
				}
			}
			System.out.println();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

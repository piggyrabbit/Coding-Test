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
		
		int num = Integer.parseInt(br.readLine());
		int a, b;
		int result;
		String aa;
		
		for(int i=0; i<num; i++) {
			str = new StringTokenizer(br.readLine());
			a = Integer.parseInt(str.nextToken());
			b = Integer.parseInt(str.nextToken());
			result = a+b;
			bw.write("Case #" + (i+1) + ": " + result + "\n");
		}
		
		bw.close();
	}

}

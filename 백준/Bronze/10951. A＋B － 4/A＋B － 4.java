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
		
		int a, b;
		int result;
		String i;
		
		while((i = br.readLine()) != null) {
			str = new StringTokenizer(i);
			a = Integer.parseInt(str.nextToken());
			b = Integer.parseInt(str.nextToken());
			result = a+b;
			bw.write(result + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

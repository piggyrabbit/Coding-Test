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

		int[] num = new int[10];
		int[] mod = new int[42];
		
		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine());
			num[i] %= 42;
		}
		
		for (int i = 0; i < 42; i++) {
			mod[i] = -1;
		}
		
		for (int i = 0; i < 10; i++) {
			mod[num[i]] = 1;
		}
		
		int nums = 0;
		
		for (int i = 0; i < 42; i++) {
			if (mod[i] == 1) {
				nums++;
			}
		}
		bw.write(nums + "\n");
		
		
		br.close();
		bw.flush();
		bw.close();
		
//		while((i = br.readLine()) != null) {
//			str = new StringTokenizer(i);
//			a = Integer.parseInt(str.nextToken());
//			b = Integer.parseInt(str.nextToken());
//			result = a+b;
//			bw.write(result + "\n");
//		}
//		br.close();
//		bw.flush();
//		bw.close();
	}

}

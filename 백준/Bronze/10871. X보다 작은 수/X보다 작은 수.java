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
		
		int n, x;
		
		str = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(str.nextToken());
		x = Integer.parseInt(str.nextToken());
		
		str = new StringTokenizer(br.readLine());
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str.nextToken());
			if (nums[i] < x) {
				bw.write(nums[i] + " ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

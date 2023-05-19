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
		
		int n;
		int min, max;
		
		n = Integer.parseInt(br.readLine());
		
		str = new StringTokenizer(br.readLine());
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str.nextToken());
		}
		
		min = nums[0];
		max = nums[0];
		
		for (int i = 0; i < n; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		
		bw.write(min + " " + max);
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}

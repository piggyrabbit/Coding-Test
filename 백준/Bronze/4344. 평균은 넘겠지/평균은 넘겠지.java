import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		
		for (int i = 0; i < c; i++) {
			int n = scan.nextInt();
			int[] scores = new int[n];
			int sum = 0;
			int cnt = 0;
			
			for (int j = 0; j < n; j++) {
				scores[j] = scan.nextInt();
				sum += scores[j];
			}
			
			for (int j = 0; j < n; j++) {
				if (scores[j] > (float)sum/n) cnt++;
			}
			
			System.out.println(String.format("%,.3f", (float)cnt/n*100) + "%");
			
		}
		
	}
}
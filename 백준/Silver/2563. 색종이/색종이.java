import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] paper = new int[101][101];
		
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			for (int p = x; p < x+10; p++) {
				for (int j = y; j < y+10; j++) {
					paper[p][j] = 1;
				}
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (paper[i][j] == 1) count++;
			}
		}
		
		System.out.println(count);
	}
}
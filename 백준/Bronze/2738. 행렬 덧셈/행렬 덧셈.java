import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for (int i = 0; i < n; i ++) {
			for(int p = 0; p < m; p++) {
				a[i][p] = scan.nextInt();
			}
		}
		for (int i = 0; i < n; i ++) {
			for(int p = 0; p < m; p++) {
				b[i][p] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int p = 0; p < m; p++) {
				System.out.print(a[i][p] + b[i][p]);
				if (p != m-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

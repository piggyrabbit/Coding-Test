import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int maxidxx = -1;
		int maxidxy = -1;
		int max = -1;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(arr[i][j] > max) {
					maxidxx = i;
					maxidxy = j;
					max = arr[i][j];
				}
			}
		}
		
		System.out.println(max);
		System.out.println((maxidxx+1) + " " + (maxidxy+1));
		
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt(); 
		int n = scan.nextInt();
		
		int result = 0;
		int min = 0;
		
		for(int i = m; i <= n; i++) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0 && i != 1) {
				result += i;
			}
			if (min == 0 && count == 0 && i != 1) min = i;
			
		}
		
		if (result != 0) {
			System.out.println(result);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}

	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			
			if (n == -1) {
				break;
			}
			
			int result = 0;
			int cnt = 0;
			
			for(int i = 1; i < n; i++) {
				if (n % i == 0) {
					result += i;
					cnt++;
				}
			}
			
			int cnt2 = 0;
			
			if (result == n) {
				System.out.print(n + " = ");
				
				for(int i = 1; i < n; i++) {
					if (n % i == 0) {
						System.out.print(i);
						cnt2++;
						if (cnt != cnt2) {
							System.out.print(" + ");
						} else {
							System.out.println();
						}
					}
				}
			} else {
				System.out.println(n +" is NOT perfect.");
			}
		}

	}
}
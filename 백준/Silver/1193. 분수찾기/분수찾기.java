import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int result = 1;
		
		for (int i = 1; i < 10000000; i++) {
			if (n >= result && n < result + i) {
				result = i;
				break;
			}
			result += i;
		}
		
		for (int i = 0; i < result; i++) {
			n -= i;
		}
		
		if (result % 2 == 0) {
			System.out.println((1+n-1) + "/" + (result - n + 1));
		} else {
			System.out.println((result - n + 1) + "/" + (1+n-1));			
		}
	}
}
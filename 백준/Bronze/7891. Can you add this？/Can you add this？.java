import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		for (int p = 0; p < i; p++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			System.out.println(a + b);
		}
		
	}
}
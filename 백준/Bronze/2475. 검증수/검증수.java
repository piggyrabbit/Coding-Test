import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int a = 0;
		for (int i = 0; i < 5; i++) {
			a = scan.nextInt();
			sum += a * a;
		}
		System.out.println(sum % 10);
	}

}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		while (true) {
			try {
				a = scan.nextInt();
				b = scan.nextInt();
			} catch (Exception e) {
				break;
			}
			System.out.println(b / (a + 1));
		}

	}
}

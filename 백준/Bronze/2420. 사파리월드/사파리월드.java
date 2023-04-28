import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = Long.parseLong(scan.next());
		long m = Long.parseLong(scan.next());

		if (n - m < 0) {
			System.out.println(m-n);
		} else {
			System.out.println(n-m);
		}
	}

}

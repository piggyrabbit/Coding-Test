import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int b = scan.nextInt();

		int exists = 0;

		for (int i = 30; i >= 0; i--) {

			if (exists == 0) {
				if (n / Math.pow(b, i) >= 1) {
					exists = 1;
					
					if ((int)(n / Math.pow(b, i)) > 9) {
						System.out.print((char)('A' + (int)(n / Math.pow(b, i) - 10)));
					} else {
					System.out.print((int)(n / Math.pow(b, i)));
					}
					n -= Math.pow(b, i) * (int) (n / Math.pow(b, i));
				}
			}
			else {
				if (n / Math.pow(b, i) >= 1) {
					if ((int)(n / Math.pow(b, i)) > 9) {
						System.out.print((char)('A' + (int)(n / Math.pow(b, i) - 10)));
					} else {
					System.out.print((int)(n / Math.pow(b, i)));
					}
				n -= (Math.pow(b, i)) * (int) (n / Math.pow(b, i));
				}
				else {
					System.out.print(0);
				}
			}
		}
	}
}
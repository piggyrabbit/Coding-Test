import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");

		String total = scan.nextLine();
		String n = scan.nextLine();

		BigInteger ttotal = new BigInteger(total);
		BigInteger nn = new BigInteger(n);

		System.out.println(ttotal.subtract((ttotal.subtract(nn)).divide(two)));
		System.out.println(ttotal.subtract(ttotal.subtract((ttotal.subtract(nn)).divide(two))));

	}
}
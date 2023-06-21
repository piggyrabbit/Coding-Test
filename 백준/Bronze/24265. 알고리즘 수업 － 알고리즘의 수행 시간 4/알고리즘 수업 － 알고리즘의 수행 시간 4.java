import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();
		
		BigInteger num = new BigInteger(n);
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger numminone = num.subtract(one);
		
		BigInteger mul = num.multiply(numminone);
		
		System.out.println(mul.divide(two));
		
		// n - 1 ~~ 1
		System.out.println(2);
	}
}
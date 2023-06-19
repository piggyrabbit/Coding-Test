import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();
		
		BigInteger num = new BigInteger(n);
		
		BigInteger result = num.multiply(num);
		
		System.out.println(result);
		System.out.println(2);
	}
}
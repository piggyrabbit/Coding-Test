import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger num1 = new BigInteger(scan.next());
		BigInteger num2 = new BigInteger(scan.next());
		
		System.out.println(num1.multiply(num2));
	}
}
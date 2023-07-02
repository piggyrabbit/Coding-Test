import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		
		System.out.println((A.add(B)).multiply(A.subtract(B)));

	}
}

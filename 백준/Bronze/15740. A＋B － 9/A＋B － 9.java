import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		BigInteger bigNumber1 = new BigInteger(a);
		BigInteger bigNumber2 = new BigInteger(b);
				
		System.out.println(bigNumber1.add(bigNumber2));

	}
}

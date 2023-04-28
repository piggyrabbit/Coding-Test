import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		
		BigInteger aa = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		
		System.out.println(aa.add(bb));
		System.out.println(aa.subtract(bb));
		System.out.println(aa.multiply(bb));
	}

}

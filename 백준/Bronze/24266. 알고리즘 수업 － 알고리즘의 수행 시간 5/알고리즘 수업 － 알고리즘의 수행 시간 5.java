import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();
		
		BigInteger nn = new BigInteger(n);
		
		System.out.println(nn.multiply(nn).multiply(nn));
		
		System.out.println(3);

	}
}
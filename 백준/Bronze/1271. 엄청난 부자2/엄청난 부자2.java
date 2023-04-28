import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		
		String[] s = str.split(" ");
		
		BigInteger a = new BigInteger(s[0]);
		BigInteger b = new BigInteger(s[1]);
		
		System.out.print(a.divide(b) + "\n" + a.mod(b));
	}

}

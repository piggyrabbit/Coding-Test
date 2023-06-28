import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((char)(arr[i] - 'a' + 'A'));
		}
	}
}
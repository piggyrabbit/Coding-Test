import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		String str2 = scan.next();
		
		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		
		System.out.println(num1.add(num2));
	}
}
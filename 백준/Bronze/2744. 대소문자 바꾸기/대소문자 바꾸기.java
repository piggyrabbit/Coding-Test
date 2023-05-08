import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97) {
				ch[i] -= 32;
			}
			else if (ch[i] < 97) {
				ch[i] += 32;
			}
			System.out.print(ch[i]);
		}
	}
}

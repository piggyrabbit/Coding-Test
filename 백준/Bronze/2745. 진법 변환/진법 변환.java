import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int num = scan.nextInt();
		
		char[] strr = str.toCharArray();
		
		char[] strr2 = new char[str.length()];
		
		for (int i = strr.length -1, j = 0; i >= 0; i--, j++) {
			strr2[j] = strr[i];
		}
		
		int[] sss = new int[strr2.length];
		
		for (int i = 0; i < strr2.length; i++) {
			if (strr2[i] >= 'A' && strr2[i] <= 'Z') {
				sss[i] = strr2[i] - 'A' + 10;
			}
			else {
				sss[i] = strr2[i] - '0';
			}
		}
		long result = 0;
		
		for (int i = 0; i < sss.length; i++) {
			result += sss[i] * Math.pow(num,i);
		}
		
		System.out.println(result);
	}
}
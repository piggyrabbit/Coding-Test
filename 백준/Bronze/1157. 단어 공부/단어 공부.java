import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		str = str.toUpperCase();
		
		int[] num = new int[26];
		
		for (int i = 0; i < str.length(); i++) {	
			num[str.charAt(i) - 'A'] ++;
		}
		
		int max = -1;
		int same = 0;
		int maxIdx = -1;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				same = 0;
				maxIdx = i;
				max = num[i];
			}
			else if (num[i] == max) {
				same = 1;
			}
		}
		if (same == 1) {
			System.out.println("?");
		} else {
			System.out.println((char)(maxIdx + 'A'));
		}
	}
}
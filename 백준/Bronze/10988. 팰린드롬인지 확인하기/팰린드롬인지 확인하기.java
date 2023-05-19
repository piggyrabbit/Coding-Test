import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		char[] arr = str.toCharArray();
		
		char[] rev = new char[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			rev[arr.length - i - 1] = arr[i];
		}
		
		int same = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != rev[i]) {
				same = 0;
				break;
			}
		}
		
		System.out.println(same);
		
	}
}
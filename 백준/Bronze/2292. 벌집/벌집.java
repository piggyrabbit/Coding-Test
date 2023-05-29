import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int result = 1;
		
		for (int i = 0; i < 1000000000; i++) {
			result += i * 6;
			if (result >= n) {
				System.out.println(i+1);
				break;
			}
		}

	}
}
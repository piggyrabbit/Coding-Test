import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			for (int p = num - i - 1; p > 0; p--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("**");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int i = num - 2; i >= 0; i--) {
			for (int p = num - i - 1; p > 0; p--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("**");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}

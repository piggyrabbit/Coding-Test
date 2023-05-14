import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a = scan.nextInt();
		int c = scan.nextInt();

		if (n*a-c < 0) { 
			System.out.println(0);
		} else
		System.out.println(n * a - c);

	}
}
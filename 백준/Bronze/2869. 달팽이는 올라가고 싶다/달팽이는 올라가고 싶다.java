import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
		
		System.out.println((v - b - 1) / (a-b) + 1);
	}
}
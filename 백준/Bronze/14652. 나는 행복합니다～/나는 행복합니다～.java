import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		
		System.out.println(k/m + " " + k%m);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		
		System.out.println(Math.round(n*0.78) + " " + Math.round(n * 0.8 + n * 0.2 * 0.78));
	}
}
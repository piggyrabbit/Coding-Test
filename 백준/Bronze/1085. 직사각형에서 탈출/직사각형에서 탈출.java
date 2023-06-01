import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int a = w - x;
		if (h - y < a) a = h - y;
		if (x < a) a = x;
		if (y < a) a = y;
		
		System.out.println(a);

	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		a = (int) (a * ((float)(100-b)/100));
		if (a >= 100) {
			System.out.println(0);
		} else System.out.println(1);
	}
}
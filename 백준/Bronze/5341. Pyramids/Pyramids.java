import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int sum = 0;
			int a = scan.nextInt();
			if (a == 0) {
				break;
			}
			for (int i = 1; i <= a; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}

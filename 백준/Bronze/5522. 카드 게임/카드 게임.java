import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = scan.nextInt();
			
			result += n;
		}
		
		System.out.println(result);
	}
}

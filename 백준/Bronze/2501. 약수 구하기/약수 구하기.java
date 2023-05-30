import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			int a = scan.nextInt();
			int b = scan.nextInt();			
			
			int cnt = 0;
			
			for(int i = 1; i <= a; i++) {
				if (a%i == 0) cnt++;
				if (cnt == b) {
					System.out.println(i);
					break;
				}
			}
			if (cnt < b) System.out.println(0);
	}
}
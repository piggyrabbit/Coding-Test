import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int score = 0;
		
		for (int i = 0; i < n; i++) {
			String str = scan.next();
			score = 0;
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					score++;
					for (int p = j-1; p >= 0; p--) {
						if (str.charAt(p) == 'O') score++;
						else break;
					}
				}
			}
			
			System.out.println(score);
		}
	}
}

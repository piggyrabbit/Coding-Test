import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			int money = scan.nextInt();
			
			System.out.print(money/25 + " ");
			
			money = money - (money/25) * 25;
			
			System.out.print(money/10 + " ");
			
			money = money - (money/10) * 10;
			
			System.out.print(money/5 + " ");
			
			money = money - (money/5) * 5;
			
			System.out.print(money + " ");
		}
	}
}
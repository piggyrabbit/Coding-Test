import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		int count = 2;
		
		while(true) {
			if (num == 1) {
				break;
			}
			if(num%count == 0) {
				System.out.println(count);
				num /= count;
				continue;
			}
			count++;
		}

	}
}
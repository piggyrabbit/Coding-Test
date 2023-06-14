import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		int max = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num%i==0 && num2%i==0) max = i;
		}
		
		System.out.println(max);
		
		for (int i = num; i <= num*num2; i++) {
			if (i%num == 0 && i%num2 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
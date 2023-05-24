import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int five = num/5;
		num %=5;
		int four = num/4;
		num%=4;
		int three = num/3;
		num%=3;
		int two = num/2;
		num%=2;
		System.out.println(num + five + four + three + two);
	}
}
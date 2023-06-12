import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if (a == b && b == c && a == 0) break;
			
			int aa = a*a;
			int bb = b*b;
			int cc = c*c;
			
			if (aa+bb == cc || bb+cc == aa || aa+cc == bb) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}
		
	}
}

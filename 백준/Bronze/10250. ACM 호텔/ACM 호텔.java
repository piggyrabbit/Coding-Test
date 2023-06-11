import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			
			int hh = n%h;
			if (hh == 0) hh = h;
			int ww = (n-1)/h + 1;
			
			if (ww < 10) {
				System.out.println(hh+"0"+ww);				
			}
			else {
				System.out.println(hh+""+ww);
			}
		}
	}
}
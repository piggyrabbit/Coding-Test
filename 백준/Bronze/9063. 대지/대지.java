import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int xmin = 10000;
		int xmax = -10000;
		
		int ymin = 10000;
		int ymax = -10000;
		
		for (int i = 0; i < n; i ++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if (x < xmin) xmin = x;
			if (x > xmax) xmax = x;
			
			if (y < ymin) ymin = y;
			if (y > ymax) ymax = y;
		}
		
		System.out.println((ymax-ymin)*(xmax-xmin));
	}
}
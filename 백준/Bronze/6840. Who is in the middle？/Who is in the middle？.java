import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int min;
		int max;
		
		min = a;
		if (min > b) min = b;
		if (min > c) min = c;
		
		max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		
		if (a != min && a != max) System.out.println(a);
		if (b != min && b != max) System.out.println(b);
		if (c != min && c != max) System.out.println(c);
	}
}

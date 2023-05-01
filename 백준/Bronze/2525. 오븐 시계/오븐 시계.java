import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int m2 = scan.nextInt();
		
		m = m + m2;
		if(m >= 60) {
		    h+=m/60;
		    m%=60;
		}
		if(h >= 24) h -=24;
		System.out.println(h + " " + m);
		
	}

}
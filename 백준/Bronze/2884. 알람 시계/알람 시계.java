import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		
		    if(m < 45) h--;
		    m = (m+15)%60;
		    if(h < 0) h = 23;
		System.out.println(h + " " + m);
		
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int a, b;
		
		for(int i=0; i<num; i++) {
		    a = scan.nextInt();
		    b = scan.nextInt();
		    
		    System.out.println(a+b);
		}
		
		
		
	}

}
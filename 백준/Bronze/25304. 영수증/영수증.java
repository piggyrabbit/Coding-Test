import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long total = scan.nextLong();
		int num = scan.nextInt();
		long sum = 0;
		int a, b;
		for(int i=1; i<=num; i++) {
		    a = scan.nextInt();
		    b = scan.nextInt();
		    sum+=a*b;
		}
		if(sum == total)
		System.out.println("Yes");
		else System.out.println("No");
		
		
		
	}

}
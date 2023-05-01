import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result;
		int max = 0;
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		
		if(a==b && a==c && b==c) result = 10000+1000*a;
		else if(a==b) result = 1000 + 100*a;
		else if(a==c) result = 1000 + 100*a;
		else if(b==c) result = 1000 + 100*b;
		else result = 100*max;
		
		System.out.println(result);
		
	}

}
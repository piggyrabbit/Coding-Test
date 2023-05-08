import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if(i<1 || i>4000) System.out.println("0");
		else if((i%4==0 && i%100!=0) || i%400 == 0) System.out.println("1");
		else System.out.println("0");
	}

}
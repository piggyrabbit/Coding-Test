import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
        
        char i = n.charAt(0);
        
        if (i == 'n' || i == 'N') {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
	}

}
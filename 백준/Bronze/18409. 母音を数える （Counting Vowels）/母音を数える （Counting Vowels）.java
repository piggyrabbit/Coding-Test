import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        
        System.out.println(count);
	}

}
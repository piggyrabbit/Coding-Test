import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        while(true) {
            String str = scan.nextLine();
            
            if (str.equals("0")) break;
            
            boolean asdf = true;
            for (int i = 0; i < str.length()/2; i++) {
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(str.length() - i - 1);
                
                if (ch1 != ch2) asdf = false;
            }
            if (asdf == true) System.out.println("yes");
            else System.out.println("no");
        }
	}
}
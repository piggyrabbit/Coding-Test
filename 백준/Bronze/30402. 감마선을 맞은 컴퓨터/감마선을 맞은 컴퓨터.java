import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        String answer = "";
        for (int i = 0; i < 15; i++) {
            String str = scan.nextLine();
            
            if (str.contains("w")) {
                answer = "chunbae";
            }
            if (str.contains("b")) {
                answer = "nabi";
            }
            if (str.contains("g")) {
                answer = "yeongcheol";
            }
        }
       System.out.println(answer);
	}

}
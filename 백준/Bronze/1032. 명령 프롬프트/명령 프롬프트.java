import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        String result = "";
        
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            
            if (result.length() == 0) {
                result = str;
            }
            else {
                for (int j = 0; j < result.length(); j++) {
                    char ch1 = result.charAt(j);
                    char ch2 = str.charAt(j);
                    
                    if (ch1 != ch2) {
                        // 해당 인덱스의 값 ?로 변경
                        result = result.substring(0, j) + "?" + result.substring(j+1);
                    }
                }
            }
        }
        
        System.out.println(result);   
	}
}
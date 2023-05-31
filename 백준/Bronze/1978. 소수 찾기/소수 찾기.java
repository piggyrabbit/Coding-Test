import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); 
		
		int[] arr = new int[n];
		
		int result = n;
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			
			if (arr[i] == 1) result --;
			
			for(int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					result --;
					break;
				}
			}
		}
		
		System.out.println(result);

	}
}
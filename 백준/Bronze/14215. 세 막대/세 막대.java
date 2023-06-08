import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문자열 입력받음
		// 그 문자열의 알파벳 개수를 셈
		// 표에 나온 크로아티아 알파벳이 등장할 때마다 중복수만큼 뺌

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int elses = 0;
		
		if (max < a) {
			max = a;
			elses = b + c;
		}
		if (max < b) {
			max = b;
			elses = a + c;
		}
		if (max < c) {
			max = c;
			elses = a + b;
		}
		
		if (max >= elses) {
			while(true) {
				max--;
				if (max < elses) break;
			}
		}
		
		System.out.println(max + elses);
		
	}
}

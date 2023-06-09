import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문자열 입력받음
		// 그 문자열의 알파벳 개수를 셈
		// 표에 나온 크로아티아 알파벳이 등장할 때마다 중복수만큼 뺌

		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[9];
		
		for (int i = 0; i < 8; i++) {
			num[i]= scan.nextInt();
		}
		
		int start = num[0];
		String type = "";
		
		for (int i = 1; i < 8; i++) {
			if (start < num[i]) {
				if (type.equals("")) {
					type = "ascending";	
					start = num[i];
				}
				if (type.equals("descending")) {
					type = "mixed";
					break;
				}
				else {
					start = num[i];
				}
			}
			
			else if (start > num[i]) {
				if (type.equals("")) {
					type = "descending";
					start = num[i];
				}
				if (type.equals("ascending")) {
					type = "mixed";
					break;
				} else start = num[i];
			}
			else {
				type = "mixed";
				break;
			}
		}
		System.out.println(type);
	}
}

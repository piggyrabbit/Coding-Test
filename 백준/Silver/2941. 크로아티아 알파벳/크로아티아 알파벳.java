import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문자열 입력받음
		// 그 문자열의 알파벳 개수를 셈
		// 표에 나온 크로아티아 알파벳이 등장할 때마다 중복수만큼 뺌

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		int sizee = str.length();

		// 해당 내용이 있을 때마다 글자를 세며 그 스트링에서 제외시킴

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.length() == 2) {
				if (str.charAt(i) == 'c' && str.charAt(i + 1) == '=') {
					sizee--;
				}
				if (str.charAt(i) == 'c' && str.charAt(i + 1) == '-') {
					sizee--;
				}
				if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
					sizee--;
				}
				if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
					sizee--;
				}
				if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
					sizee--;
				}
				if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
					sizee--;
				}
				if (str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
					sizee--;
				}
			}
			if (str.length() > 2) {
				if (str.charAt(i) == 'c' && str.charAt(i + 1) == '=') {
					sizee--;
				}
				if (str.charAt(i) == 'c' && str.charAt(i + 1) == '-') {
					sizee--;
				}
				if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
					sizee--;
				}
				if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
					sizee--;
				}
				if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
					sizee--;
				}
				if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
					sizee--;
				}
				if (i==0 && str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
					sizee--;
				}
				if (i!=0 && str.charAt(i) == 'z' && str.charAt(i + 1) == '=' && str.charAt(i-1)!='d') {
					sizee--;
				}
				if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i+2)=='=') {
					sizee = sizee - 2;
				}
			}

		}
		System.out.println(sizee);
	}
}

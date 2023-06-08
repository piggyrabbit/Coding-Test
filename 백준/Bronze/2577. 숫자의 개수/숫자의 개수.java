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

		int mul = a * b * c;

		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;
		int num8 = 0;
		int num9 = 0;
		int num10 = 0;

		for (int i = 1; i <= 9; i++) {
			int res = 0;
			if (mul / Math.pow(10, i-1) < 1) break;
			if (i == 1) {
				res = mul % 10;
			}
			else {
				res = (mul % (int)Math.pow(10, i))/(int)Math.pow(10, i-1);
			}
			
			if (res == 0)
				num0++;
			if (res == 1)
				num1++;
			if (res == 2)
				num2++;
			if (res == 3)
				num3++;
			if (res == 4)
				num4++;
			if (res == 5)
				num5++;
			if (res == 6)
				num6++;
			if (res == 7)
				num7++;
			if (res == 8)
				num8++;
			if (res == 9)
				num9++;
		}
		
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);

	}
}

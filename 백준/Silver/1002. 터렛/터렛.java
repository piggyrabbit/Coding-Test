import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();

			double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

			// 두 좌표가 같을 경우를 가정 (r1, r2의 값이 같으면 동일한 값 무한 개)
			// 하지만 좌표가 같고 r1, r2의 값이 다를 경우 같은 값 없음

			if (x1 == x2 && y1 == y2) {
				if (r1 == r2) {
					System.out.println(-1);
				} else {
					System.out.println(0);
				}
			}

			// 그 외
			else {
				// 두 교점이 나오거나
				if (Math.abs(r1 - r2) < dist && dist < r1 + r2) {
					System.out.println(2);
				}
				// 한 교점이 나옴 (내접, 외접)
				else if(dist==r1+r2 || Math.abs(r1-r2)==dist) {
                    System.out.println(1);
                }			
				// 접하지 않음
				else {
					System.out.println(0);
				}
			}
		}
	}
}
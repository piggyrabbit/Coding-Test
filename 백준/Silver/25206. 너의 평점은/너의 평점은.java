import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] str = new String[20];
		
		float totalScore = 0;
		float totalNum = 0;
		
		for (int i = 0; i < 20; i++) {
			str[i] = scan.nextLine();
			String[] tmp = str[i].split(" ");
			
			if(!tmp[2].equals("P")) {
				totalNum += Float.parseFloat(tmp[1]);
				
				if (tmp[2].equals("A+")) {
					totalScore += Float.parseFloat(tmp[1]) * 4.5;
				}
				if (tmp[2].equals("A0")) {
					totalScore += Float.parseFloat(tmp[1]) * 4.0;
				}
				if (tmp[2].equals("B+")) {
					totalScore += Float.parseFloat(tmp[1]) * 3.5;
				}
				if (tmp[2].equals("B0")) {
					totalScore += Float.parseFloat(tmp[1]) * 3.0;
				}
				if (tmp[2].equals("C+")) {
					totalScore += Float.parseFloat(tmp[1]) * 2.5;
				}
				if (tmp[2].equals("C0")) {
					totalScore += Float.parseFloat(tmp[1]) * 2.0;
				}
				if (tmp[2].equals("D+")) {
					totalScore += Float.parseFloat(tmp[1]) * 1.5;
				}
				if (tmp[2].equals("D0")) {
					totalScore += Float.parseFloat(tmp[1]) * 1.0;
				}
				if (tmp[2].equals("F")) {
					totalScore += Float.parseFloat(tmp[1]) * 0.0;
				}
				
				
			}
			
		}
		
		System.out.println(String.format("%.6f", totalScore / totalNum));
		
	}
}
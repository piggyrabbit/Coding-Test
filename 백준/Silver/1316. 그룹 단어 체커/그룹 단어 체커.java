import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 단어 몇 개 입력할지 입력받음 (n)
		// 그 사이즈만큼 배열 만들어서 루프로 받음
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String[] words = new String[n];
		
		int groupNum = n;
		
		for (int i = 0; i < n; i++) {
			words[i] = scan.next();
			
			int[] alph = new int[26];
			int now = 0;
			
			for (int j = 0; j < words[i].length(); j++) {
				if(alph[(int)(words[i].charAt(j) - 'a')] == 0) {
					alph[(int)(words[i].charAt(j) - 'a')] = 1;
					now = (int)(words[i].charAt(j) - 'a');
				} else if (now != (int)(words[i].charAt(j) - 'a')) {
					groupNum--;
					break;
				}
			}
		}	
		System.out.println(groupNum);
	}
}

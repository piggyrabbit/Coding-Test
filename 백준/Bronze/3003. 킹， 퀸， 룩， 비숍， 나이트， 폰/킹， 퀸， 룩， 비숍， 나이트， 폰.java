import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	// 1, 1, 2, 2, 2, 8
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = {1, 1, 2, 2, 2, 8};
		
		String str = scan.nextLine();
		
		String[] s = str.split(" ");
		
		int[] n = new int[s.length];
		
		for (int i = 0; i < s.length; i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((num[i] - n[i]) + " ");
		}
	}

}

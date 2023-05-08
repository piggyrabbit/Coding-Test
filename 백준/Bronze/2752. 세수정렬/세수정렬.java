import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();
		int n = scan.nextInt();
		int a = scan.nextInt();
		int c = scan.nextInt();
		
		arr.add(n);
		arr.add(a);
		arr.add(c);
		
		Collections.sort(arr);
		
		System.out.println(arr.get(0) + " " + arr.get(1) + " " + arr.get(2));
		
	}
}
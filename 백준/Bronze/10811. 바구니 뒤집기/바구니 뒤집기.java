import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str;
		
		str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int[] basket = new int[n];
		int[] temp;
		
		for (int i = 0; i < n; i++) {
			basket[i] = i + 1;
		}
		
		int a, b;
		
		for (int i = 0; i < m; i++) {
			str = new StringTokenizer(br.readLine());
			a = Integer.parseInt(str.nextToken());
			b = Integer.parseInt(str.nextToken());
			
			temp = new int[b - a + 1];
			
			for (int p = 0; p < b - a + 1; p++) {
				temp[p] = basket[a + p - 1];
			}
			
			int pp = -1;
			
			// temp[p]에 들은 숫자들을 b번째 바구니부터 a번째 바구니까지 순서대로 넣음
			for (int q = b - 1; q > a - 2; q--) {
				pp++;
				basket[q] = temp[pp];
			}
		}
		
		for (int i = 0; i < n; i++) {
			bw.write(basket[i] + " ");
		}
	
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}

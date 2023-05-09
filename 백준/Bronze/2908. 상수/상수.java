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

		String s;
		int length;

		s = br.readLine();

		String[] str = s.split(" ");

		char[] ch1 = str[0].toCharArray();
		char[] ch2 = str[1].toCharArray();
		
		char[] temp1 = new char[ch1.length];
		char[] temp2 = new char[ch2.length];
		
		for (int i = ch1.length - 1; i >= 0; i--) {
			temp1[ch1.length - 1 - i] = ch1[i];
		}
		
		for (int i = ch2.length - 1; i >= 0; i--) {
			temp2[ch2.length - 1 - i] = ch2[i];
		}
		
		str[0] = "";
		str[1] = "";
		
		for (int i = 0; i < temp1.length; i++) {
			str[0] += Character.toString(temp1[i]);
		}
		for (int i = 0; i < temp2.length; i++) {
			str[1] += Character.toString(temp2[i]);
		}
		
		if (Integer.parseInt(str[0]) > Integer.parseInt(str[1])) {
			bw.write(str[0] + "\n");
		}
		else {
			bw.write(str[1] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}

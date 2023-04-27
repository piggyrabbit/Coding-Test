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

		if (s == " ") {
			length = 0;
		} else {

			String[] ch = s.split(" ");

			length = ch.length;

			if (length != 0) {
				if (ch[0] == "") {
					length--;
				}

				if (ch[ch.length - 1] == "") {
					length--;
				}
			}
		}
		
		bw.write(length + "\n");

		br.close();
		bw.flush();
		bw.close();
	}

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;

        for (int i = 0; i < 8; i++) {
            String row = scan.next();
            for (int j = 0; j < 8; j++) {
                char ch = row.charAt(j);
                if ((i + j) % 2 == 0 && ch == 'F') {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}

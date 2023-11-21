import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int result = 0;
        boolean found = false;

        for (int i = 1; i < num; i++) {
            String str = "" + i;
            result = i;

            for (int j = 0; j < str.length(); j++) {
                result += Integer.parseInt(str.charAt(j) + "");
            }

            if (result == num) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println(0);
    }
}

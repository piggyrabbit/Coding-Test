import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] asdf = {
            {"black", "0", "1"},
            {"brown", "1", "10"},
            {"red", "2", "100"},
            {"orange", "3", "1000"},
            {"yellow", "4", "10000"},
            {"green", "5", "100000"},
            {"blue", "6", "1000000"},
            {"violet", "7", "10000000"},
            {"grey", "8", "100000000"},
            {"white", "9", "1000000000"}
        };

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();

        int firstValue = -1;
        int secondValue = -1;
        long multiplierValue = -1;

        for (int i = 0; i < asdf.length; i++) {
            if (asdf[i][0].equals(a)) {
                firstValue = Integer.parseInt(asdf[i][1]);
            }
            if (asdf[i][0].equals(b)) {
                secondValue = Integer.parseInt(asdf[i][1]);
            }
            if (asdf[i][0].equals(c)) {
                multiplierValue = Long.parseLong(asdf[i][2]);
            }
        }

        if (firstValue != -1 && secondValue != -1 && multiplierValue != -1) {
            long resistanceValue = (firstValue * 10 + secondValue) * multiplierValue;
            System.out.println(resistanceValue);
        } else {
            System.out.println("색상을 찾을 수 없습니다.");
        }
    }
}

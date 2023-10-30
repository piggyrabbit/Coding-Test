import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 학생 수
        int[] commonYears = new int[n];

        int[][] students = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                students[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int common = 0;
                    for (int k = 0; k < 5; k++) {
                        if (students[i][k] == students[j][k]) {
                            common++;
                            break; // 공통 학년이 확인되면 루프 종료
                        }
                    }
                    commonYears[i] += common; // 중복으로 카운트하지 않도록 수정
                }
            }
        }

        int temporaryLeader = 0;
        int maxCommon = commonYears[0];

        for (int i = 1; i < n; i++) {
            if (commonYears[i] > maxCommon) {
                maxCommon = commonYears[i];
                temporaryLeader = i;
            }
        }

        System.out.println(temporaryLeader + 1);
    }
}

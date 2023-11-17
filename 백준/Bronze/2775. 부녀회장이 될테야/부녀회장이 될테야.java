import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 수 T 입력
        int T = sc.nextInt();

        // 테스트 케이스만큼 반복
        for (int i = 0; i < T; i++) {
            // 각 테스트 케이스의 층 수 k 입력
            int k = sc.nextInt();
            
            // 각 테스트 케이스의 호 수 n 입력
            int n = sc.nextInt();
            
            // 거주민 수 계산
            int result = calculateResidents(k, n);
            
            // 결과 출력
            System.out.println(result);
        }

        // Scanner 닫기
        sc.close();
    }

    // 거주민 수 계산 메서드
    private static int calculateResidents(int k, int n) {
        // 2차원 배열을 이용하여 거주민 수 계산
        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1; // i층 1호에는 항상 1명 거주
            apt[0][i] = i; // 0층 i호에는 i명 거주
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        return apt[k][n];
    }
}

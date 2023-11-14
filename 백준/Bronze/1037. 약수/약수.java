import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 진짜 약수의 개수 입력
        int count = scanner.nextInt();

        // 진짜 약수 입력
        int[] divisors = new int[count];
        for (int i = 0; i < count; i++) {
            divisors[i] = scanner.nextInt();
        }

        // 진짜 약수를 정렬하여 가장 작은 수와 가장 큰 수 찾기
        Arrays.sort(divisors);
        int smallest = divisors[0];
        int largest = divisors[count - 1];

        // N 출력
        int result = smallest * largest;
        System.out.println(result);
    }
}

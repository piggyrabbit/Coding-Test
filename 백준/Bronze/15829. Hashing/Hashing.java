import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력 받기
        int L = scan.nextInt(); // 문자열의 길이
        String str = scan.next(); // 영문 소문자로만 이루어진 문자열

        // 해시 함수 계산
        long hashValue = calculateHash(L, str);

        // 결과 출력
        System.out.println(hashValue);
    }

    // 해시 함수 계산 메소드
    private static long calculateHash(int L, String str) {
        long r = 31; // 거듭제곱에 사용할 값
        long M = 1234567891; // 나눌 값
        long result = 0;

        for (int i = 0; i < L; i++) {
            // 각 문자에 대해 거듭제곱과 문자의 위치를 곱한 값을 더함
            char c = str.charAt(i);
            long value = c - 'a' + 1; // 알파벳 소문자에 대한 값을 가져옴
            result = (result + value * pow(r, i, M)) % M;
        }

        return result;
    }

    // 거듭제곱을 계산하는 메소드
    private static long pow(long base, long exponent, long mod) {
        long result = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            exponent /= 2;
        }

        return result;
    }
}

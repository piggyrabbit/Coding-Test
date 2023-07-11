import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String answer = "";
        
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i] + "";
        }
        
        Arrays.sort(arr);
        
        for (int i = arr.length - 1; i > 0; i--) {
            // 같은 앞자리수의 String을 찾아서 가장 적합한 것 찾기
            // i 인덱스에 해당하는 값과 j 인덱스 값 교환
            for (int j = i - 1; j >= 0; j--) {
                // 첫 자리가 같을 경우
                if (arr[i].substring(0,1).equals(arr[j].substring(0,1))) {
                    // 다른 자리를 비교
                    
                    if (Integer.parseInt(arr[i] + arr[j]) < Integer.parseInt(arr[j] + arr[i])) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    
                    
                    // 더 적합한 것을 찾을 경우 위치 변경
                }
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }
        
        int count = 0;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("0")) count++;
        }
        
        if (count == arr.length) answer = "0";
        
        System.out.println(answer);
        
        return answer;
    }
}
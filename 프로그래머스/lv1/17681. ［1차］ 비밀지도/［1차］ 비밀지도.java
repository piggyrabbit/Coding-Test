import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        
        String[][] map = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            // arr1[i] 값 읽어옴
            // 2진수 변환해서 map[i][0~n-1]에 차례대로 넣기
            
            int num = arr1[i];
            int num2 = arr2[i];
            
            String str = "";
            String str2 = "";
            
            str += num % 2;
            str2 += num2 % 2;
            
            while(true) {
                if (num==0) break;
                
                str += num/2 % 2;
                
                num = num/2;
            }
            
            while(true) {
                if (num2==0) break;
                
                str2 += num2/2 % 2;
                
                num2 = num2/2;
            }
            
            String tmp1 = "";
            String tmp2 = "";
            
            for (int j = str.length() - 2; j >= 0; j--) {
                tmp1 += str.charAt(j);
            }
            
            for (int j = str2.length() - 2; j >= 0; j--) {
                tmp2 += str2.charAt(j);
            }
            
            System.out.println("tmp1" + tmp1);
            System.out.println("tmp2" + tmp2);
            
            while(true) {
                if (tmp1.length() == n && tmp2.length() == n) break;
                
                if (tmp1.length() < n) tmp1 = "0" + tmp1;
                if (tmp2.length() < n) tmp2 = "0" + tmp2;
            }
            
            System.out.println("tmp1" + tmp1);
            System.out.println("tmp2" + tmp2);
            
            for (int p = 0; p < n; p++) {
                if (tmp1.charAt(p) == '1' || tmp2.charAt(p) == '1') {
                    map[i][p] = "#";
                }
                else {
                    map[i][p] = " ";
                }
            }
        }
        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = "";
            for (int j = 0; j < n; j++) {
                answer[i] += map[i][j];
            }
            
        }
        
        return answer;
    }
}
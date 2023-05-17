import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] ans = new int[commands.length];
        int anscnt = 0;
        
        for (int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            
            int cnt = 0;
            
            for (int p = commands[i][0] - 1; p <= commands[i][1] - 1; p++) {
                arr[cnt] = array[p];
                System.out.println(arr[cnt]);
                cnt++;
            }
            Arrays.sort(arr);
            ans[anscnt] = arr[commands[i][2]-1];
            System.out.println("anscnt는" + ans[anscnt]);
            anscnt++;
        }
        
        int[] answer = new int[anscnt];
        
        for (int i = 0; i < anscnt; i++) {
            answer[i] = ans[i];
        }
        
        return answer;
    }
}
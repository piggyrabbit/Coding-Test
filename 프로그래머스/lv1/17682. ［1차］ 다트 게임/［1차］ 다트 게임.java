import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        // S: 1, D: 2, T: 3제곱
        // *: 해당 점수와 바로 전 점수 2배
        // 첫 번째 기회에 * 걸리면 본인만 2배
        // #: 해당 점수 마이너스됨
        
        // 숫자 알파벳 (별 or 샵)
        for (int i = 0; i < dartResult.length(); i++) {
            // 점수
            String num = dartResult.charAt(i) + "";
            
            // 제곱수
            String power = "";
            
            // 보너스
            String bonus = "";
            
            // 숫자가 더 이어질 경우
            if (dartResult.charAt(i+1) >= '0' && dartResult.charAt(i+1) <= '9') {
                i++;
                num += dartResult.charAt(i);
            }
            // 제곱수 구하기
            i++;
            
            if (dartResult.charAt(i) == 'S') {
                power = "1";
            }
            else if (dartResult.charAt(i) == 'D') {
                power = "2";
            }
            else if (dartResult.charAt(i) == 'T') {
                power = "3";
            }
            
            // 보너스 있는지 구하기
            if (i + 1 < dartResult.length() && dartResult.charAt(i+1) == '*') {
                i++;
                bonus = "*";
            }
            else if (i + 1 < dartResult.length() && dartResult.charAt(i+1) == '#') {
                i++;
                bonus = "#";
            }
            
            // 보너스가 있을 경우
            if (bonus.length() != 0) {
                int n = Integer.parseInt(num);
                int p = Integer.parseInt(power);
                
                if (bonus.equals("*")) {
                    // 두 배 값 넣기
                    list.add((int)Math.pow(n, p) * 2);
                    
                    // 이전 것도 두 배
                    if (list.size() != 1) {
                        list.set(list.size() - 2, list.get(list.size() - 2) * 2);
                    }

                }
                if (bonus.equals("#")) {
                    list.add((int)Math.pow(n, p) * -1);
                }
            }
            // 보너스가 없을 경우
            else {
                int n = Integer.parseInt(num);
                int p = Integer.parseInt(power);
                list.add((int)Math.pow(n, p));
            }
            
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}
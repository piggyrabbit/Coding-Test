import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strings, int n) {
        // a부터 z까지 루프
        // 루프 돌 때마다 해당 알파벳에 해당하는 문자열들 리스트에 저장
        // 해당 리스트 sort
        // 리스트 내용 answer에 추가
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            ArrayList<String> temp = new ArrayList<>();
            
            char ch = (char)('a' + i);
            
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(n) == ch) temp.add(strings[j]);
            }
            
            Collections.sort(temp);
            
            for (int j = 0; j < temp.size(); j++) {
                answer.add(temp.get(j));
            }
        }
        return answer;
    }
}
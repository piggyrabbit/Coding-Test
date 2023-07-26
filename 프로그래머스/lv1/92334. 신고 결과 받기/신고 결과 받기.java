import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 특정 유저가 특정 유저를 여러 번 신고해도 1회로 처리
        
        // 신고한 유저에게 정지 메일 가는 횟수
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        
        for (int i = 0; i < report.length; i++) {
            String[] temp = report[i].split(" ");
            
            if (map.containsKey(temp[0])) {
                HashSet<String> tmp = map.get(temp[0]);
                
                tmp.add(temp[1]);
                
                map.put(temp[0], tmp);
            }
            else {
                HashSet<String> tmp = new HashSet<>();
                tmp.add(temp[1]);
                
                map.put(temp[0], tmp);
            }
        }
        
        // 신고당한 사람, 신고 횟수
        HashMap<String, Integer> result = new HashMap<>();
        
        // value 리스트만 가져와서 HashMap에 추가
        for (HashSet<String> tmp : map.values()) {
            Iterator iter = tmp.iterator();
            
            while(iter.hasNext()) {
                String str = (String) iter.next();
                
                if (result.containsKey(str)) {
                    result.put(str, result.get(str) + 1);
                }
                else {
                    result.put(str, 1);
                }
            }
        }
        
        // map: 신고자, 신고한 사람들
            // result: 신고당한 사람, 신고당한 횟수
            // res : 신고자, 메일 받은 횟수
            
            HashMap<String, Integer> res = new HashMap<>();
            
            // key가 가진 value 속 사람들의 신고당한 횟수 검색
            for (String key : map.keySet()) {
                int cnt = 0; // 메일 횟수
                
                HashSet<String> tmp = map.get(key); // 신고한 사람들
                
                Iterator iter = tmp.iterator();
                
                while(iter.hasNext()) {
                    String str = (String) iter.next();
                    
                    if (result.get(str) != null && result.get(str) >= k) {
                        cnt++;
                    }
                }
                
                for (int i = 0; i < id_list.length; i++) {
                    if (id_list[i].equals(key)) answer[i] = cnt;
                }
                
            }
        
        
        return answer;
    }
}
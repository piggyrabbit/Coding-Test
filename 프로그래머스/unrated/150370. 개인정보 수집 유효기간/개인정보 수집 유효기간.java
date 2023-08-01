import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 현재 년도
        int currYear = Integer.parseInt(today.substring(0, 4));
        // 현재 달
        int currMonth = Integer.parseInt(today.substring(5, 7));
        // 현재 일수
        int currDay = Integer.parseInt(today.substring(8, 10));
        
        int currTotal = currYear * 12 * 28 + currMonth * 28 + currDay;
        
        // 약관 종류와 기한 담은 hashmap
        HashMap<String, Integer> term = new HashMap<>();
        
        for (int i = 0; i < terms.length; i++) {
                term.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].substring(2, terms[i].length())));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            int year = Integer.parseInt(privacies[i].substring(0, 4));
            int month = Integer.parseInt(privacies[i].substring(5, 7));
            int day = Integer.parseInt(privacies[i].substring(8, 10));
            
            String t = privacies[i].substring(11, 12);
            
            // 더할 월수 구하기
            int m = term.get(t);
            
            int total = m * 28 + year * 12 * 28 + month * 28 + day;
            
            if (currTotal >= total) answer.add(i+1);
            
            
            
//             month += m;
//             day--;
            
//             if (day == 0) {
//                 day = 28;
//                 month --;
//             }
            
//             int yearPlus = 0;
            
//             if (month > 12) {
//                 yearPlus = month / 12;
//                 month = month % 12;
//             }
            
//             year += yearPlus;
            
//             System.out.println(year + ":" + month + ":" + day);
            
//             if (currYear > year) answer.add(i + 1);
//             if (currYear == year) {
//                 if (currMonth > month) answer.add(i+1);
//                 else {
//                     if (currDay > day) answer.add(i+1);
//                 }
//             }
        }
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        
        Arrays.sort(result);
        
        return result;
    }
}
class Solution {
    public String solution(String new_id) {
        String answer = "";
        boolean modify = false;
        
        if (new_id.length() < 3 || new_id.length() > 15) modify = true;
        
        char[] arr = new_id.toCharArray();
        
        if (arr[0] == '.' || arr[arr.length - 1] == '.') modify = true;
        
        for (char ch : arr) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '-' || ch == '_') {
                
            }
            else modify = true;
        }
        
        // 1단계
        new_id = new_id.toLowerCase();
        
        System.out.println(new_id);
        
        // 2단계
        arr = new_id.toCharArray();
        
        for (char ch : arr) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == '-' || ch == '_' || ch == '.') {
                answer += ch;
            }
        }
        System.out.println(answer);
        
        // 3단계
        while(true) {
            if(answer.contains("..") == false) break;
            
            answer = answer.replace("..", ".");
        }
        System.out.println(answer);
        
        // 4단계
        if (answer.length() != 0) {
            if (answer.charAt(0) == '.') {
                if (answer.length() == 1) answer = "";
                else answer = answer.substring(1, answer.length());
            }
            if (answer.length() != 0 && answer.charAt(answer.length() - 1) == '.') {
                if (answer.length() == 1) answer = "";
                else answer = answer.substring(0, answer.length() - 1);
            }
        }
        System.out.println(answer);
        
        // 5단계
        if (answer.equals("")) answer = "a";
        System.out.println(answer);
        
        // 6단계
        // new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(14) == '.') answer = answer.substring(0, 14);
        }
        System.out.println(answer);
        
        // 7단계
        while(answer.length() < 3) {
            answer+= answer.charAt(answer.length() - 1);
        }
        System.out.println(answer);
        
        return answer;
    }
}
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        int idx = -1;
        char ch = 'z';
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                ch = 'l';
                break;
            }
            if (str_list[i].equals("r")) {
                idx = i;
                ch = 'r';
                break;
            }
        }
        
        if (ch == 'l') {
            answer = new String[idx];
            
            for (int i = 0; i < idx; i++) {
                answer[i] = str_list[i];
            }
        }
        else if (ch == 'r'){
            answer = new String[str_list.length - idx - 1];
            
            for (int i = 0; i < str_list.length; i++) {
                if (str_list.length - 1 >= idx + i + 1) answer[i] = str_list[idx + i + 1];
            }
        }
        
        return answer;
    }
}
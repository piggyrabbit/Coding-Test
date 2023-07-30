class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    dic[i] = dic[i].replaceAll(spell[j], "");
                    cnt++;
                }
                else break;
            }
            if (dic[i].equals("") && cnt == spell.length) {
                return 1;
            }
        }
        
        return answer;
    }
}
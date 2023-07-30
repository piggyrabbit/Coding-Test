class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        // 아이디가 없으면 fail
        // 비밀번호만 없으면 wrong pw
        // 둘 다 있으면 login
        
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) {
                if (db[i][1].equals(id_pw[1])) return "login";
                else return "wrong pw";
            }
        }
        
        return answer;
    }
}
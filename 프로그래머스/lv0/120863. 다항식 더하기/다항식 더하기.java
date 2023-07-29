class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] arr = polynomial.split(" ");
        
        int xNum = 0;
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                if (arr[i].length() == 1) xNum++;
                else {
                    xNum += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
                }
            }
            else if (!arr[i].contains("+")) {
                num += Integer.parseInt(arr[i]);
            }
        }
        if (xNum == 0) {
            answer = ""+num;
        }
        else if (xNum == 1) {
            if (num == 0) {
                answer = "x";
            }
            else {
                answer = "x + " + num;
            }
        }
        else {
            if (num == 0) {
                answer = xNum + "x";
            }
            else {
                 answer = xNum+"x + " + num;
            }
        }
        
        return answer;
    }
}
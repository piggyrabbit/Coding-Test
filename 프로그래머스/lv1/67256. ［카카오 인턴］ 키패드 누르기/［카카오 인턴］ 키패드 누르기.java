class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int leftX = 0;
        int leftY = 3;
        
        int rightX = 2;
        int rightY = 3;
        
        for (int i = 0; i < numbers.length; i++) {
            // 왼손 담당 번호
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                
                leftX = 0;
                leftY = numbers[i] / 3;
            }
            
            // 오른손 담당 번호
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                
                rightX = 2;
                rightY = numbers[i] / 3 - 1;
            }
            
            // 중간일 경우
            else {
                // x값: 1
                // y값: numbers[i] / 3
                
                // 왼손과 오른손의 거리
                int left = 0;
                int right = 0;
                
                int x = 1;
                int y = numbers[i] / 3;
                
                if (numbers[i] == 0) y = 3;
                
                
                left = Math.abs(leftX - x) + Math.abs(leftY - y);
                right = Math.abs(rightX - x) + Math.abs(rightY - y);
                
                if (left < right) {
                    answer += "L";
                    leftX = x;
                    leftY = y;
                }
                if (left > right) {
                    answer += "R";
                    rightX = x;
                    rightY = y;
                }
                if (left == right) {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightX = x;
                        rightY = y;
                    }
                    if (hand.equals("left")) {
                        answer += "L";
                        leftX = x;
                        leftY = y;
                    }
                }
            }
            
            
        }
        
        return answer;
    }
}
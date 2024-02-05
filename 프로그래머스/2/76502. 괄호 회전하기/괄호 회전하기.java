import java.util.Stack;

public class Solution {
    static public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String rotatedString = rotateString(s, i);
            if (isValid(rotatedString)) {
                answer++;
            }
        }

        return answer;
    }

    private static String rotateString(String s, int offset) {
        return s.substring(offset) + s.substring(0, offset);
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
            } else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

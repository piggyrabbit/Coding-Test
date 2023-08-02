import java.util.*;

class Solution {
    public ArrayList<String> solution(String myStr) {
        
        myStr = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ");
        
        String[] arr = myStr.split(" ");
        
        String[] answer = new String[arr.length];
        
        ArrayList<String> ans = new ArrayList<>();
        
        if (answer.length == 0) {
            ans.add("EMPTY");
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals("")) {
                    ans.add(arr[i]);
                }
            }
        }
        
        return ans;
    }
}
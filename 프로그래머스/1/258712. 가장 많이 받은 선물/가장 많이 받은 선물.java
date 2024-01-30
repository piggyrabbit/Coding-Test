import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        List<String> friendList = new ArrayList<>();
        HashMap<String, Integer> giftDegree = new HashMap<>();
        HashMap<String, HashMap<String, Integer>> giftGraph = new HashMap<>();

        for (String friend : friends) {
            friendList.add(friend);
            giftDegree.put(friend, 0);
            giftGraph.put(friend, new HashMap<>());
        }

        for (String gift : gifts) {
            String[] giftName = gift.split(" ");
            String giver = giftName[0];
            String receiver = giftName[1];

            giftDegree.put(giver, giftDegree.get(giver) + 1);
            giftDegree.put(receiver, giftDegree.get(receiver) - 1);

            HashMap<String, Integer> giverGraph = giftGraph.get(giver);
            giverGraph.put(receiver, giverGraph.getOrDefault(receiver, 0) + 1);
        }

        for (String giver : friendList) {
            int num = 0;
            for (String receiver : friendList) {
                if (giver.equals(receiver)) {
                    continue;
                }

                int giverToReceiver = giftGraph.get(giver).getOrDefault(receiver, 0);
                int receiverToGiver = giftGraph.get(receiver).getOrDefault(giver, 0);

                if (giverToReceiver > receiverToGiver ||
                    (giverToReceiver == receiverToGiver && giftDegree.get(giver) > giftDegree.get(receiver))) {
                    num++;
                }
            }

            if (answer < num) {
                answer = num;
            }
        }

        return answer;
    }
}

import java.util.*;

class Solution {
    public static int[] solution(String[] genres, int[] plays) {
		// 해쉬맵으로 각 장르의 총 조회수 찾기
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
		}
		System.out.println(map);

		// 조회수의 내림차순으로 키값 리스트에 저장
		List<String> keySet = new ArrayList<>(map.keySet());
		keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
		System.out.println(keySet);

		// 총조회수가 큰값부터 상위 두개 인덱스 값 저장(1개면 하나만 저장)
		int max1 = 0;
		int max2 = 0;
		List<Integer> result = new ArrayList<>();
		for (String str : keySet) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < genres.length; i++) {
				if (genres[i].equals(str)) {
					list.add(plays[i]);
				}
			}
			Collections.sort(list, Collections.reverseOrder());
			System.out.println(list);

			if (list.size() > 1) {
				max1 = list.get(0);
				max2 = list.get(1);
				System.out.println("max1:" + max1);
				System.out.println("max2:" + max2);

				int temp = 0;
				for (int i = 0; i < plays.length; i++) {
					if (str.equals(genres[i])) {
						if (max1 == plays[i]) {
							temp = i;
							result.add(i);
							break;
						}
					}
				}
				System.out.println(temp);
				System.out.println(result);

				for (int i = 0; i < plays.length; i++) {
					if (str.equals(genres[i])) {
						if (max2 == plays[i] && i != temp) {
							result.add(i);
							break;
						}
					}
				}

				System.out.println(result);
			} else {
				max1 = list.get(0);
				for (int i = 0; i < plays.length; i++) {
					if (max1 == plays[i]) {
						result.add(i);
					}
				}
			}
		}

		int[] answer = new int[result.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
}
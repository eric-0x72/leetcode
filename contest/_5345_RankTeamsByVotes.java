package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class _5345_RankTeamsByVotes {

	public static String rankTeams(String[] votes) {

		int n = votes[0].length();
		HashMap<Character, int[]> map = new HashMap<>();

		// initialise map, put in zero vectors
		for (char c : votes[0].toCharArray()) {
			int[] init = new int[n];
			Arrays.fill(init, 0);
			map.put(c, init); // character and votes
		}

		for (String vote : votes) {
			for (int i = 0; i < n; i++) {
				char c = vote.charAt(i);
				map.get(c)[i] = map.get(c)[i] + 1;
			}
		}

		List<Character> list = new ArrayList<Character>(map.keySet());

		Collections.sort(list, new Comparator<Character>() {
			@Override
			public int compare(Character a, Character b) {
				for (int i = 0; i < n; i++) {
					if (map.get(b)[i] != map.get(a)[i])
						return map.get(b)[i] - map.get(a)[i];
				}
				return a.compareTo(b); // alphabetical order
			}
		});

		StringBuilder sb = new StringBuilder();
		for (char c : list)
			sb.append(c);

		return sb.toString();
	}

//	class Solution:
//	    def rankTeams(self, votes: List[str]) -> str:
//	        n = len(votes[0])
//	        d = dict()
//	        for c in votes[0]:
//	            d[c] = [0] * n
//	        for vote in votes:
//	            for i, c in enumerate(vote):
//	                d[c][i] += 1
//	        
//	        u = [(k, v) for k, v in d.items()]
//	        u.sort(key=lambda x: (x[1], -ord(x[0])), reverse=True)
//	        return "".join([x[0] for x in u])

	public static void main(String[] args) {
		String[] a = { "ABC", "ACB", "ABC", "ACB", "ACB" };
		String res = rankTeams(a);
		System.out.println(res);

	}
}

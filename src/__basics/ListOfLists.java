package __basics;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {

	public static void main(String[] args) {

		List<List<Integer>> li = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			li.add(new ArrayList<>());
		}
		
		System.out.println(li);
	}
}

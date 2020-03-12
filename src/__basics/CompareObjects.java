package __basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Card implements Comparable<Card> {

	private int suit;
	private int value;

	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card o) {
		return this.getValue() - o.getValue();
	}
}

public class CompareObjects {

	public static void main(String[] args) {
		Card[] hand = new Card[5];
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			hand[i] = new Card(rand.nextInt(5), rand.nextInt(12));
		}

		Arrays.sort(hand);
		System.out.println(Arrays.toString(hand));

		Arrays.sort(hand, new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				int a = o1.getSuit();
				int b = o2.getSuit();
				return a - b;
			}
		});
	}
}

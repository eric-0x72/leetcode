package __basics;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * differences between HashMap and Hashtable:
 * 
 * 1. Hashtable is synchronized, whereas HashMap is not. This makes HashMap
 * better for non-threaded applications, as unsynchronized Objects typically
 * perform better than synchronized ones. // HashMap��ͬ���������̰߳�ȫ
 * 
 * 2. Hashtable does not allow null keys or values. HashMap allows one null key
 * and any number of null values.
 * 
 * 3. One of HashMap's subclasses is LinkedHashMap, so in the event that you'd
 * want predictable iteration order (which is insertion order by default), you
 * could easily swap out the HashMap for a LinkedHashMap. This wouldn't be as
 * easy if you were using Hashtable.
 */

/**
 * 
 * 
 * HashMap is an implementation of Map. A Map maps keys to values. The key look
 * up occurs using the hash ;;;; key -> value (key to value) map, e.g {a -> 1,
 * -> 2, c -> 2, -> 1}
 * 
 * HashSet is an implementation of Set. A Set is designed to match the
 * mathematical model of a set. A HashSet does use a HashMap to back its
 * implementation. However, it implements an entirely different interface
 * HashSet is a set, e.g. {1,2,3,4,5}
 */

public class HashMap_HashTable {

	public static void main(String[] args) {

		// HashMap
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("hello", 12);
		hm.put("world", 7);
		boolean a = hm.containsKey("world");
		boolean b = hm.containsValue(8);

		// Hashtable
		Hashtable<String, Integer> ht = new Hashtable<>();

	}

}

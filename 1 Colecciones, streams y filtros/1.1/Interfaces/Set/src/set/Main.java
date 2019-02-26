package set;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		hSet.add("test");
		hSet.add(123);
		hSet.add(null);
		hSet.add(55.22);
		System.out.println("Size of the list " + hSet.size());
	}
}

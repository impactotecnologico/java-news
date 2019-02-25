package treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<>();
	    treeSet.add("First");
	    treeSet.add("Second");
	    treeSet.add("Third");
	    Iterator<String> itr = treeSet.iterator();
	    while (itr.hasNext()) {
	        System.out.println(itr.next());
	    }

	}

}

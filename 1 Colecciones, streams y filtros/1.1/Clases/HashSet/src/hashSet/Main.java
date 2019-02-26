package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashSet<String> hset = 
	    new HashSet<String>();

	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");

	      hset.add("Apple");
	      hset.add("Mango");
	      
	      hset.add(null);
	      hset.add(null);

	      System.out.println(hset);
	    }

}

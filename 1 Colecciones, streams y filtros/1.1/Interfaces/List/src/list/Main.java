package list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add("test");
		aList.add(123);
		aList.add(null);
		aList.add(55.22);
		System.out.println("Size of the list " + aList.size());
	}

}

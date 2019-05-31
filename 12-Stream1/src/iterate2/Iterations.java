package iterate2;

import java.util.Arrays;
import java.util.List;

public class Iterations {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");

		list.forEach(s -> System.out.println(s));
		System.out.println("----");

		for(String s: list){
			System.out.println(s);
		}
		System.out.println("----");

		list.parallelStream().forEach(s -> System.out.println(s));


	}

}

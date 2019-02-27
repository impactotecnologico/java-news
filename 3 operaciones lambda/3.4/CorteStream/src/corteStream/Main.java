package corteStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		Optional<Integer> result =
			    lista.stream().filter(obj -> obj>3).findFirst();
		System.out.println(result);
		
		boolean result2 = lista.stream().anyMatch(obj -> obj<3);
		System.out.println(result2);

	}

}

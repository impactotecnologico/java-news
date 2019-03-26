package functions;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista=Arrays.asList("hola","que","tal");
		
        lista.stream().map((x)->x.toUpperCase()).forEach((x)->System.out.println(x));
	}

}

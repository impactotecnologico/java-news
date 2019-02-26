package operators;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<String> lista=Arrays.asList("hola","que","tal");
        Optional<String> resultado=lista.stream().reduce(String::concat);
        if(resultado.isPresent()) {
             
            System.out.println(resultado.get());
        }


	}

}

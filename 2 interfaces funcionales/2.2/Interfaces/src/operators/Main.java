package operators;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("hola", "que", "tal");
		Optional<String> resultado = lista.stream().reduce(String::concat);
		if (resultado.isPresent()) {
			System.out.println(resultado.get());
		}
		
		

		int vals[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int sum = Arrays.stream(vals).sum();
		System.out.printf("La sumatoria es: %d%n", sum);
		long n = Arrays.stream(vals).count();
		System.out.printf("El total es: %d%n", n);

		
		
		List<String> palabras = Arrays.asList("Cadena", "Impacto", "Tecnologico", "ImpactoTecnologico", "CursoDeJava");
		Optional<String> cadenaLarga = palabras.stream()
				.reduce((palabra1, palabra2) -> palabra1.length() > palabra2.length() ? palabra1 : palabra2);
		cadenaLarga.ifPresent(System.out::println);

	}

}

package main1;

import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// Se instancia el builder para un Stream de strings Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Añadiendo elementos al Stream
		Stream<String> stream = builder.add("Geeks")
				.add("Geeks 2")
				.build();

		// Mostrando elementos del Stream
		stream.forEach(System.out::println);

	}

}

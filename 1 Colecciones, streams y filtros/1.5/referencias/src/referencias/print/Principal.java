package referencias.print;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {

		Consumer<String> consumidor = (x) -> System.out.println(x);
		procesar(consumidor, "Hola Mundo");
	}

	public static <T> void procesar(Consumer<T> expresion, T mensaje) {

		expresion.accept(mensaje);
	}

}
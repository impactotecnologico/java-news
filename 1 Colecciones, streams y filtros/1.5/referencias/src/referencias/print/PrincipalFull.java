package referencias.print;

import java.util.function.Consumer;

public class PrincipalFull {

	public static void main(String[] args) {

		Consumer<String> consumidor = (x) -> System.out.println(x);
		
		procesar(consumidor, "Hola Mundo");
		procesar((x) -> System.out.println(x), "hola2");
		procesar(PrincipalFull::imprimir, "hola3");
		
		/*
		Impresora i= new Impresora();
		procesar(i::imprimir,"hola4");
		*/

	}

	public static <T> void procesar(Consumer<T> expresion, T mensaje) {

		expresion.accept(mensaje);
	}

	public static void imprimir(String mensaje) {

		System.out.println("---------");
		System.out.println(mensaje);
		System.out.println("---------");
	}
}

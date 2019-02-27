package optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		nullPointerTipico();
		
		optionalVacio();
		
		optionalAnulable();
		
		orElseEjemplo();
		
		ejemploThrow();
		
		isPresentEjemplo();
		
		ifPresentEjemplo();
		
		ejemploMap();
		
		filterEjemplo();

	}
	
	private static void nullPointerTipico() {
		try {
			String str = null;
			System.out.println(str.contains("algo"));
		}catch(NullPointerException ex) {
			System.out.println("Null pointer");
		}
	}
	
	private static void optionalVacio() {
		try {
			Optional<String> vacio = Optional.empty();
			System.out.println(vacio.get());
		}catch(NoSuchElementException ex) {
			System.out.println("Sin elementos");
		}
	}
	
	private static void optionalAnulable() {
		try {
			String str = null;
			Optional<String> optionalAnulable = Optional.ofNullable(str);
			System.out.println(optionalAnulable.get());
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
	}
	
	private static void orElseEjemplo() {
		Car coche1 = new Car("200");
		Car cochePorDefecto = new Car("500");
		
		Optional<Car> optionalCoche = Optional.of(coche1);
		String precio = optionalCoche.orElse(cochePorDefecto).getPrecio();
		System.out.println("El precio del coche es: "+precio);
		
		//else
		Optional<Car> coche2 = Optional.empty();
		precio = coche2.orElse(cochePorDefecto).getPrecio();
		System.out.println("El precio del coche es: "+precio);
	}
	
	private static void ejemploThrow() {
		try {
			Car nulo = null;
			Optional<Car> optionalCarNulo = Optional.ofNullable(nulo);
			optionalCarNulo.orElseThrow(IllegalStateException::new);
		}catch(IllegalStateException ex) {
			System.out.println("El coche tiene valor nulo");
		}
	}
	
	private static void isPresentEjemplo() {
		Optional<String> str = Optional.of("Pedro");
		if(str.isPresent()) {
			System.out.println(str.get());
		}
	}
	
	private static void ifPresentEjemplo() {
		Optional<String> str = Optional.of("Pedro 2");
		str.ifPresent(System.out::println);
	}
	
	private static void ejemploMap() {
		Optional<String> str = Optional.of("lorem ipsum lo que sigue en la cadena de texto en latín");
		Optional<Integer> sizeOptional = str.map(String::length);
		
		System.out.println("el tamaño del string " + sizeOptional.orElse(0));
		
		//else
		Optional<String> strNull = Optional.ofNullable(null);
		Optional<Integer> sizeNull = strNull.map(x -> x.length());
		
		System.out.println("El tamaño del string: "+sizeNull.orElse(0));
	}
	
	private static void filterEjemplo() {
		Optional<Car> cocheVacio = Optional.empty();
		cocheVacio.filter(x->"250".equals(x.getPrecio())).ifPresent(x->System.out.println(x.getPrecio() + " coche vacio"));
		
		//Si el valor no pasa el filtro
		Optional<Car> cocheMuyCaro = Optional.of(new Car("3000"));
		cocheMuyCaro.filter(x->"250".equals(x.getPrecio())).ifPresent(x->System.out.println(x.getPrecio() + " coche muy caro"));
		
		//Si pasa el filtro y tiene valores
		Optional<Car> cocheAceptable = Optional.of(new Car("250"));
		cocheAceptable.filter(x->"250".equals(x.getPrecio())).ifPresent(x->System.out.println(x.getPrecio() + " coche aceptable"));
	
	}

}

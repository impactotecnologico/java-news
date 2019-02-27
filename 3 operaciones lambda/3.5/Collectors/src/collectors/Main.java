package collectors;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	static Libros l1= new Libros("El señor de los anillos",1000);
	static Libros l2= new Libros("La fundacion",500);
	static Libros l3= new Libros("El caliz de fuego",600);
	
	public static void main(String[] args) {
		array();
		list();
		set();
		join();
		reduce();
	}
	
	public static void array() {
		Stream<Libros> libros = Stream.of(l1,l2,l3);
		Libros[] arrayLibro= libros.toArray(Libros[]::new);
		  
		 for(int i=0;i<arrayLibro.length;i++) {
			 System.out.println(arrayLibro[i].getPaginas());
		 }
	}
	
	public static void list() {
		Stream<Libros> libros = Stream.of(l1,l2,l3);
		List<Libros> lista= libros.collect(Collectors.toList());
		 
		for (Libros l:lista) {
			System.out.println(l.getTitulo());
		}
	}
	
	public static void set() {
		Stream<Libros> libros = Stream.of(l1,l2,l3);
		Set<Libros> lista= libros.collect(Collectors.toSet());
		 
		for (Libros l:lista) {
			System.out.println(l.getTitulo());
		}
	}
	
	public static void join() {
		Stream<Libros> libros = Stream.of(l1,l2,l3);
		String resultado = libros.map((l) -> l.getTitulo()).collect(Collectors.joining(","));
		 
		System.out.println(resultado);
	}
	
	public static void reduce() {
		Stream<Libros> libros = Stream.of(l1,l2,l3);
		Optional<Integer> resultado3 = libros.map((l) -> l.getPaginas()).collect(Collectors.reducing(Integer::sum));
		 
		System.out.println(resultado3.get());

	}

}

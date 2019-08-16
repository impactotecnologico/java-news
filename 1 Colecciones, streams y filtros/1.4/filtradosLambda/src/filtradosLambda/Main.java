package filtradosLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
//		Persona p1 = new Persona("juan", "sanchez", 20);
//		Persona p2 = new Persona("ana", "gomez", 12);
//		Persona p3 = new Persona("pedro", "gutierrez", 40);
//		List<Persona> lista = Arrays.asList(p1, p2, p3);
//
//		getFilter(lista);
//		getMap(lista);
//		getCollect(lista);
//		getParallel(lista);
//		getFiltered();
//		getLimit();
//		getDistinct();
//		getSort();
		getJoin();
//		getStatistics();
		

	}

	public static void getFilter(List<Persona> lista) {
		System.out.println("getFilter=======");
		Stream<Persona> personsOver18 = lista.stream().filter(p -> p.getEdad() > 18);
		personsOver18.forEach(item -> System.out.println(item.getNombre()));
		System.out.println("getFilter=======");
	}

	public static void getMap(List<Persona> lista) {
		System.out.println("getMap=======");
		Stream<Persona> students = lista.stream().filter(p -> p.getEdad() > 18)
				.map(person -> new Persona(person.getNombre(), person.getApellidos(), person.getEdad() * 2));
		System.out.println(students.findFirst().get());
		System.out.println("getMap=======");
	}

	public static void getCollect(List<Persona> lista) {
		System.out.println("getCollect=======");
		List collected = lista.stream().filter(p -> p.getEdad() > 18)
				.map(person -> new Persona(person.getNombre(), person.getApellidos(), person.getEdad() * 3))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(collected);
		System.out.println("getCollect=======");
	}

	public static void getParallel(List<Persona> lista) {
		System.out.println("getParallel=======");
		List parallel = lista.stream().parallel().filter(p -> p.getEdad() > 18).sequential()
				.map(person -> new Persona(person.getNombre(), person.getApellidos(), person.getEdad()))
				.peek(item -> System.out.println(item.getNombre())).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("getParallel=======");

		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel();
		stream = stream.filter(i -> i % 2 == 0);
		OptionalInt opt = stream.findAny();
		if (opt.isPresent()) {
			System.out.println(opt.getAsInt());
		}
		System.out.println("simpleParallel=======");
		
	}
	
	public static void getFiltered() {
		System.out.println("getFiltered=======");
		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered2 = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered2);
		System.out.println("getFiltered=======");

	}

	public static void getLimit() {
		System.out.println("getLimit=======");
		Random random = new Random();
		random.ints().limit(3).forEach(System.out::println);
		System.out.println("getLimit=======");
	}

	public static void getDistinct() {
		System.out.println("getDistinct=======");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
		System.out.println("getDistinct=======");
	}

	public static void getSort() {
		System.out.println("getSort=======");
		Random random2 = new Random();
		random2.ints().limit(4).sorted().forEach(System.out::println);
		System.out.println("getSort=======");
	}
	
	
	
	

	public static void getJoin() {
		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		String mergedString = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(";"));
		System.out.println("Merged String: " + mergedString);

	}

	
	
	
	
	
	public static void getStatistics() {
		List<Integer> integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

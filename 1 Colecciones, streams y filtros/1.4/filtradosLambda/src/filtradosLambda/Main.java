package filtradosLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("juan", "sanchez", 20);
		Persona p2 = new Persona("ana", "gomez", 12);
		Persona p3 = new Persona("pedro", "gutierrez", 40);
		List<Persona> lista=Arrays.asList(p1,p2,p3);
		
		getFilter(lista);
		getMap(lista);
		getCollect(lista);
		getParallel(lista);
		getLimit();
		getDistinct();
		getSort();
		getJoin();
		getStatistics();
		
	}
	
	public static void getFilter(List<Persona> lista) {
		Stream<Persona> personsOver18 = lista.stream().filter(p -> p.getEdad() > 18);
		personsOver18.forEach(item -> System.out.println(item.getNombre()));
	}
	
	public static void getMap(List<Persona> lista) {
		Stream students = lista.stream().filter(p -> p.getEdad() > 18).map(person -> new Persona(person.getNombre(), person.getApellidos(), person.getEdad())).peek(item -> System.out.println(item.getNombre()));
	}
	
	public static void getCollect(List<Persona> lista) {
		List collected = lista.stream().filter(p -> p.getEdad() > 18).map(person -> new Persona(person.getNombre(), person.getApellidos(), person.getEdad())).peek(item -> System.out.println(item.getNombre())).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static void getParallel(List<Persona> lista) {
		List parallel = lista.stream().parallel().filter(p -> p.getEdad() > 18).sequential().map(person -> new Persona(person.getNombre(), person.getApellidos(), person.getEdad())).peek(item -> System.out.println(item.getNombre())).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public static void getLimit() {
		Random random = new Random();
		random.ints().limit(4).forEach(System.out::println);
	}
	
	public static void getDistinct() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
	}
	
	public static void getSort() {
		Random random2 = new Random();
		random2.ints().limit(4).sorted().forEach(System.out::println);
	}
	
	public static void getJoin() {
		List<String>strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered2 = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered2);
		String mergedString = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
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

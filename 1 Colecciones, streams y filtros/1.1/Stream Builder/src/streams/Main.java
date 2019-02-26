package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	public static void main(String [] args) {
		//filtrado
		List<String> strings = Arrays.asList("abc", "", "cdf", "bc", "","abcd", "", "Pedro", "","");
		List<String> filtrado = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtrado);
		
		//limit con foreach
		Random random = new Random();
		random.ints().limit(4).forEach(System.out::println);
		
		//map con distinct
		List<Integer> numbers = Arrays.asList(3,2,2,4,5,5,9,3,5,8,7);
		List<Integer> cuadrados = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		
		System.out.println(cuadrados);
		
		//Sort
		Random random2 = new Random();
		random2.ints().limit(5).sorted().forEach(System.out::println);
		
		//Collector y merge
		List<String> strings2 = Arrays.asList("abc","","Pedro","Maria","","Diana", "Jose");
		List<String> filtrado2 = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
		
		System.out.println(filtrado2);
		String merged = strings2.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));
		
		System.out.println("Strings enlazados: "+merged);
		
		//Estadísticas
		List<Integer> enteros = Arrays.asList(3,2,2,5,8,7,4);
		IntSummaryStatistics stats = enteros.stream().mapToInt((x)-> x).summaryStatistics();
		
		System.out.println("El mayor valor de la lista: " + stats.getMax());
		System.out.println("El menor valor de la lista: " + stats.getMin());
		System.out.println("La sumatoria de los valores de la lista es: " + stats.getSum());
		System.out.println("El promedio de la sumatoria de los valores de la lista es: " + stats.getAverage());
		System.out.println("El total de elementos en la lista es: " + stats.getCount());
	}
}

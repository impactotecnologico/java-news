package map;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Persona p1= new Persona("pedro","perez", 20);
		Persona p2= new Persona("juan","perez",25);
		Persona p3= new Persona("ana","perez",30);
		List<Persona> lista= new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		int total=lista.stream().mapToInt(Persona::getEdad).sum();
		System.out.println(total);
		lista.stream().mapToDouble(Persona::getEdad).average().ifPresent(System.out::println);
		lista.stream().mapToInt(Persona::getEdad).max().ifPresent(System.out::println);
		lista.stream().mapToInt(Persona::getEdad).min();
		
		DoubleSummaryStatistics estadisticas=lista.stream().mapToDouble(Persona::getEdad).summaryStatistics();
		System.out.println(estadisticas.getAverage());


	}
}

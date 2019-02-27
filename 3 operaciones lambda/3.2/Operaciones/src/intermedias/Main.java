package intermedias;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", "BMW", 10000));
        vehiculos.add(new Vehiculo("2222BBB", "AUDI", 20000));
        vehiculos.add(new Vehiculo("3333CCC", "OPEL", 30000));
        vehiculos.add(new Vehiculo("4444DDD", "BMW", 100000));
        vehiculos.add(new Vehiculo("5555EEE", "AUDI", 200000));
        vehiculos.add(new Vehiculo("6666FFF", "OPEL", 300000));
        vehiculos.add(new Vehiculo("7777GGG", "CITROEN", 0));

        map(vehiculos);
        filter(vehiculos);
        sorted(vehiculos);
        distinct(vehiculos);
        peek(vehiculos);
        limit(vehiculos);
	}
	
	public static void map(List<Vehiculo> vehiculos) {
		// Alteración de kilómetros
		List<Integer> result = vehiculos.stream()
		        .map(v -> v.getKilometros()*2)
		        .collect(Collectors.toList());
		System.out.println(result);
		
		// Proyección del campo kilómetros
		List<Integer> result2 = vehiculos.stream()
		        .map(Vehiculo::getKilometros)
		        .collect(Collectors.toList());
		System.out.println(result2);
	}
	
	public static void filter(List<Vehiculo> vehiculos) {
		List<Vehiculo> result = vehiculos.stream()
		        .filter(v -> v.getModelo().equals("AUDI"))
		        .collect(Collectors.toList());
		result.forEach(item->System.out.println(item.getPlaca()+", "+item.getModelo()+", "+item.getKilometros()));
	}
	
	public static void sorted(List<Vehiculo> vehiculos) {
		List<Vehiculo> result = vehiculos.stream()
		        .sorted((v1, v2) -> Integer.compare(v1.getKilometros(), v2.getKilometros()))
		        .collect(Collectors.toList());
		result.forEach(item->System.out.println(item.getPlaca()+", "+item.getModelo()+", "+item.getKilometros()));
	}
	
	public static void distinct(List<Vehiculo> vehiculos) {
		List<String> result = vehiculos.stream()
		         .map(Vehiculo::getModelo)
		         .distinct()
		         .collect(Collectors.toList());
		result.forEach(item->System.out.println(item));
	}
	
	public static void peek(List<Vehiculo> vehiculos) {
		List<String> result = vehiculos.stream()
		        .filter(v -> v.getKilometros() > 20000)
		        .peek(v -> System.out.println(v.getPlaca()+", "+v.getModelo()+", "+v.getKilometros()))
		        .map(Vehiculo::getPlaca)
		        .peek(v -> System.out.println(v))
		        .collect(Collectors.toList());
	}
	
	public static void limit(List<Vehiculo> vehiculos) {
		List<Vehiculo> result = vehiculos.stream()
		        .limit(2)
		        .collect(Collectors.toList());
		result.forEach(item->System.out.println(item.getPlaca()+", "+item.getModelo()+", "+item.getKilometros()));
	}

}

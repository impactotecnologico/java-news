package terminales;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import intermedias.Vehiculo;

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
        
        forEach(vehiculos);
        collect(vehiculos);
        reduce(vehiculos);
	}
	
	public static void forEach(List<Vehiculo> vehiculos) {
		vehiculos.parallelStream()
	        .limit(5)
	        .forEach(item->System.out.println(item.getPlaca()+", "+item.getModelo()+", "+item.getKilometros()));
	}
	
	public static void collect(List<Vehiculo> vehiculos) {
		List<Vehiculo> result = vehiculos.parallelStream()
		        .limit(5)
		        .collect(Collectors.toList());
		result.forEach(item->System.out.println(item.getPlaca()+", "+item.getModelo()+", "+item.getKilometros()));
	}
	
	public static void reduce(List<Vehiculo> vehiculos) {
		Integer result = vehiculos.stream()
		        .map(v -> v.getKilometros())
		        .reduce(0, Integer::sum);
		System.out.println(result);
	}

}

package LongFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.LongFunction;

public class Main {

	public static void main(String[] args) {
		LongFunction<String> getStatus = tramitesExtranjeria->{
			Map<Long,String> tramites = new HashMap<>();
			tramites.put(912312312L, "Proceso Completado");
			tramites.put(844312343L, "In Progress");
			tramites.put(111312353L, "Rechazado");
			tramites.put(777312399L, "Esperando Aprobación");
			
			if(tramites.containsKey(tramitesExtranjeria)) {
				return tramites.get(tramitesExtranjeria);
			} else {
				return "Nro de Trámite Inválido";
			}
		};
		long input = 912312312L;
		String status = getStatus.apply(input);
		System.out.println("Status de trámite Nro. "+input+": "+status);
	}

}

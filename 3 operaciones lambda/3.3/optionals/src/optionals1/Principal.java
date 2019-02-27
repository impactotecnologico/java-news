package optionals1;

import java.util.Optional;

public class Principal {
	
	public static void main(String[] args) {
		ServicioPersonas sp = new ServicioPersonas();
		Optional<Persona> per = sp.buscar("Pedro");
		if(per.isPresent()) {
			System.out.println(per.get().getNombre());
		}else {
			System.out.println("La persona no existe");
		}
		
	}

}

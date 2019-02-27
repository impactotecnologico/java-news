package optionals1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicioPersonas {
	static List<Persona> lista = new ArrayList<Persona>();
	static {
		lista.add(new Persona("Pedro"));
		lista.add(new Persona("Angel"));
		lista.add(new Persona("María"));
	}
	
	public Optional<Persona> buscar(String nombre) {
		return lista.stream().filter(p->p.getNombre()==nombre).findFirst();
	}
}

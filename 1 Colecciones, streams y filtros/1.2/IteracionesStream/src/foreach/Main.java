package foreach;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("juan", "sanchez", 20);
		Persona p2 = new Persona("ana", "gomez", 12);
		Persona p3 = new Persona("pedro", "gutierrez", 40);
		List<Persona> lista=Arrays.asList(p1,p2,p3);
		
		lista.stream().forEach((p)-> {
            System.out.println(p.getNombre());
            System.out.println(p.getApellidos());
            System.out.println(p.getEdad());
        });


	}

}

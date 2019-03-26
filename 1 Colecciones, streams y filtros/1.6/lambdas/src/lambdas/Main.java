package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
	static List<Alumno> listaAlumnos = new ArrayList<>();
	
	public static void main(String[] args) {
		crear();
		
		obtenerTodos();
		
		filtroNombre();
		
		totalAlumnos();
		
		notasAprobadas();
		
		primerosAlumnos();
		
		menorEdad();
		
		primeroEnLista();
		
		filtradoPorCaracter();
	}
	
	public static void crear() {
		
		String[] nombres = {"Javier", "Lillian","Pedro","Manuel","Jose Julian","Gabriel","Martha","Joel","Juanjo","Maria"};
		String[] apellidos = {"Molina Cano", "Gomez Alvarez","Duque", "Gonzalez","Gomez Gutierrez","Fernández de la Peña","Morillo Perez","Valente","Diaz Jiménez","Marin"};
		
		final String nombreCurso = "Java 8";
		
		for (int i = 0; i < 10; i++) {
			int calificacion = new Random().ints(2, 10).limit(1).findFirst().getAsInt();
			int edad = new Random().ints(20, 40).limit(1).findFirst().getAsInt();
			listaAlumnos.add(new Alumno(i, "12345" + i, nombres[i], apellidos [i], nombreCurso, calificacion, edad));
		}
	}
	
	public static void obtenerTodos() {
		System.out.println("****Obtenemos todos los alumnos****");
		listaAlumnos.stream().forEach(a->System.out.println(a));
	}
	
	public static void filtroNombre() {
		System.out.println("****filtrado de alumnos cuyo nombre comience por L o G****");
		listaAlumnos.stream().filter(c->c.getNombre().charAt(0)=='L' || c.getNombre().charAt(0) == 'G').forEach(c->System.out.println(c));
	}
	
	public static void totalAlumnos() {
		System.out.println("****Imprimir el total de alumnos en la lista****");
		System.out.println(listaAlumnos.stream().count());
	}
	
	public static void notasAprobadas() {
		System.out.println("****Imprimir alumnos con notas mayores a 7****");
		listaAlumnos.stream().filter(a->a.getNota() > 7).forEach(p->System.out.println(p));
	}
	
	public static void primerosAlumnos() {
		System.out.println("****Obtener los primeros 3 alumnos****");
		listaAlumnos.stream().limit(3).forEach(a -> System.out.println(a));
	}
	
	public static void menorEdad() {
		System.out.println("****Obtener alumno con menor edad****");
		System.out.println(listaAlumnos.stream().min(Comparator.comparing(Alumno::getEdad)));
	}
	
	public static void primeroEnLista() {
		System.out.println("****Imprimir primer alumno de la lista****");
		System.out.println(listaAlumnos.stream().findFirst());
	}
	
	public static void filtradoPorCaracter() {
		System.out.println("****filtrado de alumnos por caracter en su nombre****");
		listaAlumnos.stream().filter(a->a.getNombre().contains("a")).forEach(System.out::println);
	}
}

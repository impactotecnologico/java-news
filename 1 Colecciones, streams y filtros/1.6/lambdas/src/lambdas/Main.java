package lambdas;

import java.util.ArrayList;
import java.util.List;

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
		listaAlumnos.add(new Alumno(1, "1234566","Javier", "Molina Cano", "Java 8", 7, 28));
		listaAlumnos.add(new Alumno(2, "1234566","Lillian", "Gómez Alvarez", "Java 8", 10, 33));
		listaAlumnos.add(new Alumno(3, "1234566","Sixto", "Marin", "Java 8", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1234566","Gerardo", "Duque", "Java 8", 10, 13));
		listaAlumnos.add(new Alumno(5, "1234566","Pedro", "Plasencia Velasquez", "Java 8", 9.5, 15));
		listaAlumnos.add(new Alumno(6, "1234566","José", "Ariza Gonzalez", "Java 8", 8, 34));
		listaAlumnos.add(new Alumno(7, "1234566","Germán", "Lotero", "Java 8", 9, 18));
		listaAlumnos.add(new Alumno(8, "1234566","Oscar", "Murillo", "Java 8", 9, 32));
		listaAlumnos.add(new Alumno(9, "1234566","Augusto", "Palacio", "Java 8", 9, 20));
		listaAlumnos.add(new Alumno(10, "1234566","César", "Alzate", "Java 8", 9, 25));
		listaAlumnos.add(new Alumno(11, "1234566","Gloria", "Gomes", "Java 8", 9, 36));
		listaAlumnos.add(new Alumno(12, "1234566","Maria", "Valente", "Java 8", 7, 22));
		listaAlumnos.add(new Alumno(13, "1234566","Rafael", "Blasco", "Java 8", 7, 24));
		listaAlumnos.add(new Alumno(14, "1234566","Jorge", "Ruiz León", "Java 8", 5, 26));
		listaAlumnos.add(new Alumno(15, "1234566","Gabriel", "Diaz Jimenez", "Java 8", 9, 39));
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
		System.out.println(listaAlumnos.stream().min((a1, a2)-> a1.getEdad() - a2.getEdad()));
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

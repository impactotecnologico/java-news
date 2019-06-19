package BiFunctionThen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		BiFunction<Estudiante,Asignatura,Boolean> checkSiEstudianteTieneAsignatura = (estudiante,asignatura)->{
			if(estudiante!=null && asignatura!=null){
				List<Asignatura> encontradas = estudiante.getSubjects();
				if(encontradas!=null && !encontradas.isEmpty()){
					for(Asignatura cadaUna : encontradas){
						if(cadaUna.getName().equals(asignatura.getName())){
							return true;
						}
					}
				}
			}
			return false;
		};
		Function<Boolean,String> getStatus = (valid)->{
			if(valid){
				return "Encontrada";
			} else {
				return "No Encontrada";
			}
		};
		
		BiFunction<Estudiante,Asignatura,String> getAsignaturaCheckStatus = checkSiEstudianteTieneAsignatura.andThen(getStatus);
		
		Estudiante student = new Estudiante("Tom Hanks");
		
		Asignatura maths = new Asignatura("Maths");
		Asignatura english = new Asignatura("English");
		Asignatura science = new Asignatura("Science");
		
		List<Asignatura> asignatura = new ArrayList<Asignatura>();
		asignatura.add(science);
		asignatura.add(english);
		asignatura.add(maths);
		
		student.setSubjects(asignatura);
		
		Asignatura geography = new Asignatura("Geograohy");
		String checkSubjectStatus = getAsignaturaCheckStatus.apply(student, geography);
		System.out.println("Does Student have Geography? : "+checkSubjectStatus);
		
		System.out.println("Does Student have Math? : "+getAsignaturaCheckStatus.apply(student, maths));
		System.out.println("Does Student have English? : "+getAsignaturaCheckStatus.apply(student, english));
		
		Asignatura history = new Asignatura("History");
		System.out.println("Does Student have History? : "+getAsignaturaCheckStatus.apply(student, history));


	}

}

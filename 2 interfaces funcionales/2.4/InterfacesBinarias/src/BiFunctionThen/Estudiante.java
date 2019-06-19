package BiFunctionThen;

import java.util.List;

public class Estudiante {
	String name;
	List<Asignatura> asignaturas;
	
	public Estudiante(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Asignatura> getSubjects() {
		return asignaturas;
	}
	public void setSubjects(List<Asignatura> subjects) {
		this.asignaturas = subjects;
	}

}

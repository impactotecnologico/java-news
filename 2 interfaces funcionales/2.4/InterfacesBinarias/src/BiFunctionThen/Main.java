package BiFunctionThen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		BiFunction<Student,Subject,Boolean> checkIfStudentHasSubject = (student,subject)->{
			if(student!=null && subject!=null){
				List<Subject> existingSubjects = student.getSubjects();
				if(existingSubjects!=null && !existingSubjects.isEmpty()){
					for(Subject eachSubject : existingSubjects){
						if(eachSubject.getName().equals(subject.getName())){
							return true;
						}
					}
				}
			}
			return false;
		};
		Function<Boolean,String> getStatus = (valid)->{
			if(valid){
				return "Found Subject";
			} else {
				return "Could not find Subject";
			}
		};
		
		BiFunction<Student,Subject,String> getSubjectCheckStatus = checkIfStudentHasSubject.andThen(getStatus);
		
		Student student = new Student("Tom Hanks");
		
		Subject maths = new Subject("Maths");
		Subject english = new Subject("English");
		Subject science = new Subject("Science");
		
		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(science);
		subjects.add(english);
		subjects.add(maths);
		
		student.setSubjects(subjects);
		
		Subject geography = new Subject("Geograohy");
		String checkSubjectStatus = getSubjectCheckStatus.apply(student, geography);
		System.out.println("Does Student have Geography? : "+checkSubjectStatus);
		
		System.out.println("Does Student have Math? : "+getSubjectCheckStatus.apply(student, maths));
		System.out.println("Does Student have English? : "+getSubjectCheckStatus.apply(student, english));
		
		Subject history = new Subject("History");
		System.out.println("Does Student have History? : "+getSubjectCheckStatus.apply(student, history));


	}

}

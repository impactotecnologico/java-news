package ToIntFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntFunction;

public class Main {

	public static void main(String[] args) {
		ToIntFunction<String> getMarks = student->{
			Map<String,Integer> studentMarks = new HashMap<>();
			studentMarks.put("Anthony Lane", 87);
			studentMarks.put("Jade Pluk", 34);
			studentMarks.put("Olivia Tanner",76);
			studentMarks.put("Jesse Jones", 66);
			
			if(studentMarks.containsKey(student)){
				return studentMarks.get(student);
			} else {
				return 00;
			}
		};
		
		String input = "Anthony Lane";
		int marks = getMarks.applyAsInt(input);
		System.out.println("Marks of Student "+input+": "+marks);

	}

}

package ToDoubleFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		ToDoubleFunction<String> getMarks = student->{
			Map<String,Double> studentMarks = new HashMap<>();
			studentMarks.put("Anthony Lane", 87.0);
			studentMarks.put("Jade Pluk", 34.0);
			studentMarks.put("Olivia Tanner",76.5);
			studentMarks.put("Jesse Jones", 66.5);
			
			if(studentMarks.containsKey(student)){
				return studentMarks.get(student);
			} else {
				return 00.00;
			}
		};
		
		String input = "Anthony Lane";
		double marks = getMarks.applyAsDouble(input);
		System.out.println("Marks of Student "+input+": "+marks);

	}

}

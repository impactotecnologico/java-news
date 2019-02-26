package LongToIntFunction;

import java.util.function.LongToIntFunction;

public class Main {

	public static void main(String[] args) {
		LongToIntFunction getInt = longVal->{
			int intVal = (int) longVal;
			return intVal;
		};
		
		long input = 675764L;
		System.out.println("input: "+input);
		
		int result = getInt.applyAsInt(input);
		System.out.println("result : "+result);

	}

}

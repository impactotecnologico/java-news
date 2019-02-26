package intToDoubleFunction;

import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		IntToDoubleFunction getDouble = intVal->{
			double doubleVal = intVal;
			return doubleVal;
		};
		
		int input = 10;
		double result = getDouble.applyAsDouble(input);
		System.out.println("Input "+input+" as double : "+result);

	}

}

package intToLongFunction;

import java.util.function.IntToLongFunction;

public class Main {

	public static void main(String[] args) {
		IntToLongFunction getLong = intVal->{
			long longVal = intVal;
			return longVal;
		};
		
		int input = 10;
		long result = getLong.applyAsLong(input);
		System.out.println("Input "+input+" as long : "+result);

	}

}

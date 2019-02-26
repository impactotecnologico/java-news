package LongToDoubleFunction;

import java.util.function.LongToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		LongToDoubleFunction getDouble = longVal->{
			double doubleVal = longVal;
			return doubleVal;
		};
		
		long input = 675764L;
		System.out.println("input: "+input);
		
		double result = getDouble.applyAsDouble(input);
		System.out.println("result : "+result);

	}

}

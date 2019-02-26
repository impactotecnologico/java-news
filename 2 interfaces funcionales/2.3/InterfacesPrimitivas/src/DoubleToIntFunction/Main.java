package DoubleToIntFunction;

import java.util.function.DoubleToIntFunction;

public class Main {

	public static void main(String[] args) {
		DoubleToIntFunction getInt = doubleVal->{
			int intVal = (int) doubleVal;
			return intVal;
		};
		
		double input=23.76;
		System.out.println("input : "+input);
		int result = getInt.applyAsInt(input);
		System.out.println("Result : "+result);

	}

}

package DoubleToLongFunction;

import java.util.function.DoubleToLongFunction;

public class Main {

	public static void main(String[] args) {
		DoubleToLongFunction getLong = doubleVal->{
			long longVal = (long) doubleVal;
			return longVal;
		};
		
		double input = 23.165;
		System.out.println("input : "+input);
		long result = getLong.applyAsLong(input);
		System.out.println("result : "+result);

	}

}

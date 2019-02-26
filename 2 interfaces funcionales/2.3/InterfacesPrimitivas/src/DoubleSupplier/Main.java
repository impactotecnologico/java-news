package DoubleSupplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleSupplier;

public class Main {

	public static void main(String[] args) {
		DoubleSupplier getRandomDouble = ()->{
			double doubleVal = ThreadLocalRandom.current().nextDouble(0000, 9999);
			return Math.round(doubleVal);
		};
		
		double randomVal = getRandomDouble.getAsDouble();
		System.out.println("Random Double Generated : "+randomVal);
		
		//Generate some more random numbers
		System.out.println("Random Double Generated : "+getRandomDouble.getAsDouble());
		System.out.println("Random Double Generated : "+getRandomDouble.getAsDouble());
		System.out.println("Random Double Generated : "+getRandomDouble.getAsDouble());

	}

}

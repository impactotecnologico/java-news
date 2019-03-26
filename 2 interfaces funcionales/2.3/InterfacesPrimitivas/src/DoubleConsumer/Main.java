package DoubleConsumer;

import java.util.function.DoubleConsumer;

public class Main {

	public static void main(String[] args) {
		DoubleConsumer incrementByOne = doubleVal->{
			System.out.println("Incrementing "+doubleVal+" by one...");
			System.out.println("Current Value : "+(doubleVal+1));
		};
		
		DoubleConsumer decrementByOne = doubleVal->{
			System.out.println("Decrementing "+doubleVal+" by one...");
			System.out.println("Current Value : "+(doubleVal-1));
		};
		
		DoubleConsumer doAction = incrementByOne.andThen(decrementByOne);
		doAction.accept(1000);
	}

}

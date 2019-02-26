package IntSupplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntSupplier;

public class Main {

	public static void main(String[] args) {
		IntSupplier getRandomInt = ()->{
			return ThreadLocalRandom.current().nextInt(0000,9999);
		};
		
		int randomVal = getRandomInt.getAsInt();
		System.out.println("Random Integer Generated : "+randomVal);
		
		//Generate some more random numbers
		System.out.println("Random Integer Generated : "+getRandomInt.getAsInt());
		System.out.println("Random Integer Generated : "+getRandomInt.getAsInt());
		System.out.println("Random Integer Generated : "+getRandomInt.getAsInt());

	}

}

package LongSupplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.LongSupplier;

public class Main {

	public static void main(String[] args) {
		LongSupplier getRandomLong = ()->{
			long longVal = ThreadLocalRandom.current().nextLong(10000000, 99999999);
			return longVal;
		};
		
		long randomVal = getRandomLong.getAsLong();
		System.out.println("Random Long Generated : "+randomVal);
		
		//Generate some more random numbers
		System.out.println("Random Long Generated : "+getRandomLong.getAsLong());
		System.out.println("Random Long Generated : "+getRandomLong.getAsLong());
		System.out.println("Random Long Generated : "+getRandomLong.getAsLong());

	}

}

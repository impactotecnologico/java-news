package LongConsumer;

import java.util.function.LongConsumer;

public class Main {

	public static void main(String[] args) {
		LongConsumer displayNextVal = l->{
			System.out.println("Display the next value to input : "+l);
			System.out.println(l+1);
		};
		
		LongConsumer displayPrevVal = l->{
			System.out.println("Display the previous value to input : "+l);
			System.out.println(l-1);
		};
		
		
		LongConsumer displayPrevAndNextVal = displayNextVal.andThen(displayPrevVal);
		
		displayPrevAndNextVal.accept(1000);

	}

}

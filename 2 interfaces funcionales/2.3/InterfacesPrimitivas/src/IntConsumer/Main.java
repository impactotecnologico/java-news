package IntConsumer;

import java.util.function.IntConsumer;

public class Main {

	public static void main(String[] args) {
		IntConsumer displayNextInt = i->System.out.println("Next Int Value : "+(i+1));
		
		IntConsumer displaySquare = i->System.out.println("Int Square Value : "+(i*i));
		
		IntConsumer displayBoth = displayNextInt.andThen(displaySquare);
		
		displayBoth.accept(20);

	}

}

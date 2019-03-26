package supplier;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<String> i  = ()-> "Java 8 Rocks!";
	    
        System.out.println(i.get());
        
        
        Supplier<Double> randomValue = () -> Math.random(); 
        System.out.println(randomValue.get()); 
        
        
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());

        int x = 0, y= 1;
        bs = () -> x > y;
        System.out.println(bs.getAsBoolean());

	}

}

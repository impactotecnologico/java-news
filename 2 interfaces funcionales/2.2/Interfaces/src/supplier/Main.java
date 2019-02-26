package supplier;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<String> i  = ()-> "java2s.com";
	    
        System.out.println(i.get());

	}

}

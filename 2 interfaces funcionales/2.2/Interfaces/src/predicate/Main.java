package predicate;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista=Arrays.asList(1,3,4,5,6,7,1,2);
        lista.stream().filter((x)->x>5).forEach(System.out::println);  
        
        

	}

}

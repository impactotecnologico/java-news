package IntPredicate;

import java.util.function.IntPredicate;

public class Main {

	public static void main(String[] args) {
		IntPredicate isEven = i->{
			if(i%2==0){
				return true;
			}
			return false;
		};
		
		System.out.println("Is 10 an even number? : "+isEven.test(10));
		System.out.println("Is 111 an even number? : "+isEven.test(111));
		System.out.println("Is 16 an even number? : "+isEven.test(16));

	}

}

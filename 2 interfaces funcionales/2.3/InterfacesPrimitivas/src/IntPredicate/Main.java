package IntPredicate;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class Main {

	public static void main(String[] args) {
		IntPredicate buscaPares = i->{
			if(i%2==0){
				return true;
			}
			return false;
		};
		
		System.out.println("10 es par? : "+buscaPares.test(10));
		System.out.println("111 es par? : "+buscaPares.test(111));
		System.out.println("16 es  par? : "+buscaPares.test(16));
		
		IntPredicate isWhitespace = Character::isWhitespace;
		IntPredicate isUpper = Character::isUpperCase;
		IntConsumer print = System.out::println;

		"aB cD eF".chars().filter(isWhitespace.negate().and(isUpper)).forEach(print);

	}

}

package LongPredicate;

import java.util.function.LongPredicate;

public class Main {

	public static void main(String[] args) {
		LongPredicate isLengthEven = longVal->{
			if(Long.toString(longVal).length()%2==0){
				return true;
			}
			return false;
		};
		
		System.out.println("Is Length of 10003 even? : "+isLengthEven.test(1003L));
		System.out.println("Is Length of 87654354 even? : "+isLengthEven.test(87654354L));
		System.out.println("Is Length of 4444444 even? : "+isLengthEven.test(4444444L));
		System.out.println("Is Length of 99 even? : "+isLengthEven.test(99L));

	}

}

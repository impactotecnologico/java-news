package DoublePredicate;

import java.util.function.DoublePredicate;

public class Main {

	public static void main(String[] args) {
		DoublePredicate isLengthEven = doubleVal->{
			if(Double.toString(doubleVal).length()%2==0){
				return true;
			}
			return false;
		};
		
		System.out.println("Is 10.33 of even length? : "+isLengthEven.test(10.33));
		System.out.println("Is 111.4223 of even length? : "+isLengthEven.test(111.4223));
		System.out.println("Is 1677777.0 of even length? : "+isLengthEven.test(1677777.0));
		System.out.println("Is 99 of even length? : "+isLengthEven.test(99));

	}

}

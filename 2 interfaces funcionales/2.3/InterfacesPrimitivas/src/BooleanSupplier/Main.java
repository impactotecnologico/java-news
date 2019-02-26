package BooleanSupplier;

import java.util.Calendar;
import java.util.function.BooleanSupplier;

public class Main {

	public static void main(String[] args) {
		BooleanSupplier checkIFCurrentDateisEven = ()->{
			Calendar cal = Calendar.getInstance();
			Integer currentDate = cal.get(Calendar.DAY_OF_MONTH);
			if(currentDate%2==0){
				return true;
			}
			return false;
		};
		
		boolean isCurrentDateEven = checkIFCurrentDateisEven.getAsBoolean();
		
		System.out.println("Is Current Date Even? : "+isCurrentDateEven);

	}

}

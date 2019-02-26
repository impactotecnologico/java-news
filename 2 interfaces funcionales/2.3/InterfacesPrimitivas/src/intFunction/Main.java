package intFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class Main {

	public static void main(String[] args) {
		IntFunction<String> getMonthOfTheYearName =  monthNo->{
			Map<Integer,String> months = new HashMap<>();
			months.put(1, "January");
			months.put(2, "February");
			months.put(3, "March");
			months.put(4, "April");
			months.put(5, "May");
			
			if(months.get(monthNo)!=null){
				return months.get(monthNo);
			} else {
				return "Input must be between 1 and 5";
			}
			
		};
		
		int input = 1;
		String month = getMonthOfTheYearName.apply(input);
		System.out.println("Month no. "+input+" is : "+month);

	}

}

package BiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		BiFunction<List<String>,String,Boolean> checkValueInList = (list,value)->{
			if(list!=null && list.contains(value)){
				return true;
			} else {
				return false;
			}
		};
		
		List<String> values = new ArrayList<String>();
		values.add("item1");
		values.add("item2");
		values.add("item3");
		values.add("item4");
		values.add("item5");
		
		boolean valid = checkValueInList.apply(values, "item3");
		System.out.println("Does the list contains item3? : "+valid);
		
		System.out.println("Does the list contains item1? : "+checkValueInList.apply(values, "item1"));
		System.out.println("Does the list contains item6? : "+checkValueInList.apply(values, "item6"));
		System.out.println("Does the list contains item9? : "+checkValueInList.apply(values, "item9"));

	}

}

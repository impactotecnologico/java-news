package BiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		BiPredicate<List<String>,String> checkIfInList = (list,value)->{
			if(list!=null && !list.isEmpty() && value!=null){
				if(list.contains(value)){
					return true;
				} 
			}
			return false;
		};
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		Boolean isInList = checkIfInList.test(fruits, "Water Melon");
		System.out.println("Is Water Melon present in the List ? : "+isInList);
		
		System.out.println("Is Grapes present in the List ? : "+checkIfInList.test(fruits, "Grapes"));
		System.out.println("Is Apple present in the List ? : "+checkIfInList.test(fruits, "Apple"));


	}

}

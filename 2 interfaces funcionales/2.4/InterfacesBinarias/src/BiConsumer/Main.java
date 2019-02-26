package BiConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		BiConsumer<List<String>, String> biConsumer = (list, value) -> {
			// print every item on the list except value
			for (String item : list) {
				if (!item.equals(value)) {
					System.out.println(item);
				}
			}
		};
		
		List<String> values = new ArrayList<String>();
		values.add("item1");
		values.add("item2");
		values.add("item3");
		values.add("item4");
		values.add("item5");
		biConsumer.accept(values, "item3");


	}

}

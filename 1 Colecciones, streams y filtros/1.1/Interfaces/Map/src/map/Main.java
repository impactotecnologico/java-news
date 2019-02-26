package map;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		hMap.put(123,"name1");
		hMap.put("key",12.34);
		hMap.put(null, "123");
		System.out.println("Map Elements ::" + hMap);
		System.out.println("Value is     ::" + hMap.get(null));
		System.out.println("Keys are     ::"+ hMap.keySet());
		System.out.println("Values are   ::"+ hMap.values());

	}
}

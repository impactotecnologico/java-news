package arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		nombreArrayList.add("Elemento");
		nombreArrayList.add(1,"Elemento 2");
		System.out.println(nombreArrayList.size());
		System.out.println(nombreArrayList.get(1));
		System.out.println(nombreArrayList.contains("Elemento"));
		System.out.println(nombreArrayList.indexOf("Elemento"));
		System.out.println(nombreArrayList.lastIndexOf("Elemento"));
		System.out.println(nombreArrayList.remove(1));
		System.out.println(nombreArrayList.remove("Elemento"));
		nombreArrayList.clear();
		System.out.println(nombreArrayList.isEmpty());  
		ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
		Object[] array = nombreArrayList.toArray();

	}
}

package arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Declaraci�n de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		// A�ade el elemento al ArrayList
		nombreArrayList.add("Elemento");
		// A�ade el elemento al ArrayList en la posici�n 'n'
		nombreArrayList.add(1,"Elemento 2");
		// Devuelve el numero de elementos del ArrayList
		nombreArrayList.size();
		// Devuelve el elemento que esta en la posici�n '2' del ArrayList
		nombreArrayList.get(1);
		// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
		nombreArrayList.contains("Elemento");
		// Devuelve la posici�n de la primera ocurrencia ('Elemento') en el ArrayList  
		nombreArrayList.indexOf("Elemento");
		// Devuelve la posici�n de la �ltima ocurrencia ('Elemento') en el ArrayList   
		nombreArrayList.lastIndexOf("Elemento");
		// Borra el elemento de la posici�n '5' del ArrayList   
		nombreArrayList.remove(1); 
		// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
		nombreArrayList.remove("Elemento");
		//Borra todos los elementos de ArrayList   
		nombreArrayList.clear();
		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
		nombreArrayList.isEmpty();  
		// Copiar un ArrayList 
		ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
		// Pasa el ArrayList a un Array 
		Object[] array = nombreArrayList.toArray();

	}
}

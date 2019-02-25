package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> listEmployees = new ArrayList<>();
		 
		listEmployees.add(new Employee("Tom", 40000));
		listEmployees.add(new Employee("Adam", 60000));
		listEmployees.add(new Employee("Jim", 70000));
		listEmployees.add(new Employee("Dane", 35000));
		listEmployees.add(new Employee("Jack", 56000));
		listEmployees.add(new Employee("Carol", 67000));
		
		Employee jim = new Employee("Jim");
		 
		Collections.sort(listEmployees);
		 
		int index = Collections.binarySearch(listEmployees, jim);
		 
		if (index >= 0) {
		    jim = listEmployees.get(index);
		    System.out.println("Found employee: " + jim);
		}

	}

}

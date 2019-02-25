package searching;

public class Employee implements Comparable<Employee> {
	int salary;
	String name;

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return this.name + " (salary: " + salary + ")";
	}

	public int compareTo(Employee another) {
		return this.name.compareTo(another.name);
	}
}

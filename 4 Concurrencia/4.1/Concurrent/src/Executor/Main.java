
package Executor;

import java.util.concurrent.Executor;

public class Main {

	public static void main(String[] args) {
		execute();
	}
	
	public static void execute() {
	    Executor executor = new Invoker();
	    executor.execute( () -> {
	        System.out.println("Hola executor" + Thread.currentThread().getName());
	    });
	    System.out.println("Final!!!"+Thread.currentThread().getName());
	}
}

package no____consumer;

import java.util.Date;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Consumer<Date> reset = fecha -> fecha.setTime(0);
		Consumer<Date> print = System.out::println;
		 
		Date fecha = new Date();
		reset.andThen(print).accept(fecha);
		
		reset.andThen(print).accept(fecha);
	}

}

package forkjoin;

import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main2 {
	static final int SIZE = 10000000;
	static int[] array = randomArray();
	
	public static void main(String [] args) {
		
		
		
		
		ContadorArray mainTask = new ContadorArray(array, 0, SIZE);
		ForkJoinPool pool = new ForkJoinPool();
		
		long ini = Instant.now().toEpochMilli();
		Integer contadorDePares = pool.invoke(mainTask);
		long fin = Instant.now().toEpochMilli();
		
		System.out.println("El total de numeros pares es: " + contadorDePares);
		
		
		
		System.out.println(fin-ini);
		
		
		
		
		
		
		
		mainTask = new ContadorArray(array, 0, SIZE);
		ini = Instant.now().toEpochMilli();
		contadorDePares = mainTask.calcula();
		fin = Instant.now().toEpochMilli();
		
		System.out.println("El total de numeros pares es: " + contadorDePares);
		
		
		
		System.out.println(fin-ini);
		
		
	}
	
	static int[] randomArray() {
		int[] array = new int[SIZE];
		Random random = new Random();
		for(int i = 0 ; i<SIZE; i++) {
			array[i] = random.nextInt(100);
		}
		
		return array;
	}
}

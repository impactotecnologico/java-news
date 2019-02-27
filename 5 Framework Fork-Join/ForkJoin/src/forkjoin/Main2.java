package forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main2 {
	static final int SIZE = 10000000;
	static int[] array = randomArray();
	
	public static void main(String [] args) {
		ContadorArray mainTask = new ContadorArray(array, 0, SIZE);
		ForkJoinPool pool = new ForkJoinPool();
		Integer contadorDePares = pool.invoke(mainTask);
		
		System.out.println("El total de números pares es: " + contadorDePares);
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

package forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

		static final int SIZE = 10000000;
		static int[] array = randomArray();
	public static void main(String[] args) {
		int number = 9;
		System.out.println("Los primeros 10 elementos del array son");
		print();
		ArrayTransform mainTask = new ArrayTransform(array, number, 0, SIZE);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
		
		System.out.println("Los primeros 10 elementos del array tras ser transformados son: ");
		print();
	
}
		
		//construir arreglo random
		static int[] randomArray() {
			int[] array = new int[SIZE];
			Random random = new Random();
			
			for(int i = 0; i < SIZE; i++) {
				array[i] = random.nextInt(100);
			}
			
			return array;
		}
		
		//print 
		static void print() {
			for(int i=0;i<10;i++) {
				System.out.println((array[i]+" , "));
			}
		}

	}


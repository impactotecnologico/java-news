package forkjoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class Main {

	static final int SIZE = 10000000;
	static int[] array = randomArray();

	public static void main(String[] args) {
		int number = 9;
		
		IntStream stream1 = Arrays.stream(array);
		stream1.limit(10).forEach(System.out::println);

		
		ArrayTransform mainTask = new ArrayTransform(array, number, 0, SIZE);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
		
		System.out.println("Convertidos:");

		stream1 = Arrays.stream(array);
		stream1.limit(10).forEach(System.out::println);

	}

	// construir arreglo random
	static int[] randomArray() {
		int[] array = new int[SIZE];
		Random random = new Random();

		for (int i = 0; i < SIZE; i++) {
			array[i] = random.nextInt(100);
		}

		return array;
	}

}

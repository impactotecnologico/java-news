package forkjoin;

import java.util.concurrent.RecursiveAction;

public class ArrayTransform extends RecursiveAction{
	int[] array;
	int number;
	int threshold = 100000;
	int start;
	int end;
	
	public ArrayTransform(int[] array, int number, int start, int end) {
		this.array = array;
		this.number = number;
		this.start = start;
		this.end = end;
	}
	
	protected void compute() {
		if(end - start < threshold) {
			convierte();
		}else {
			int middle = (end + start) / 2;
			ArrayTransform subtask1 = new ArrayTransform(array, number, start, middle);
			ArrayTransform subtask2 = new ArrayTransform(array, number, middle, end);
			
			invokeAll(subtask1, subtask2);
		}
	}
	
	public void convierte() {
		for(int i=start;i<end;i++) {
			array[i] = array[i] * number;
		}
	}
	
	
}

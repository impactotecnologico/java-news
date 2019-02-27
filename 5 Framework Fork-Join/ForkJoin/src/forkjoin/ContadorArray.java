package forkjoin;

import java.util.concurrent.RecursiveTask;

public class ContadorArray extends RecursiveTask<Integer>{
	int[] array;
	int threshold = 100000;
	int start;
	int end;
	
	public ContadorArray(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}
	
	protected Integer compute() {
		if(end-start < threshold) {
			return computeDirectly();
		}else {
			int middle = (end + start) / 2;
			
			ContadorArray subtask1 = new ContadorArray(array, start, middle);
			ContadorArray subtask2 = new ContadorArray(array, middle, end);
			
			invokeAll(subtask1, subtask2);
			
			return subtask1.join()+subtask2.join();
		}
		
	}
	
	protected Integer computeDirectly() {
		Integer count = 0;
		for(int i = start; i< end; i++) {
			if(array[i]%2==0) {
				count++;
			}
		}
		
		return count;
	}

}

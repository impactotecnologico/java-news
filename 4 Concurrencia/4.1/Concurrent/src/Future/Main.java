package Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		Runnable task=()-> {
			   System.out.println("runnable task");
			};
			 
			ExecutorService executorService= Executors.newSingleThreadExecutor();
			Future future=    executorService.submit(task);
			try {
				System.out.println("value - "+future.get()); //retorna null si la tarea se completa bien
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}


}

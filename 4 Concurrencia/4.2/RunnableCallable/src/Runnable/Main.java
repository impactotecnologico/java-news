package Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		executeTask();
	}
	
	public static void executeTask() {
	    ExecutorService executorService = Executors.newSingleThreadExecutor();
	    Future future = executorService.submit(new EventLoggingTask());
	    executorService.shutdown();
	}


}

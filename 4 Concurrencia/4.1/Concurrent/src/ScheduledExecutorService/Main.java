package ScheduledExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		conDelayAndPeriod();
		
		futuroSimple();

	}

	private static void futuroSimple() throws InterruptedException, ExecutionException {
		ScheduledExecutorService executor = Executors.
			    newSingleThreadScheduledExecutor();
			 
			ScheduledFuture future = executor.schedule(
			    new Callable<String>() {
			 
			        @Override
			        public String call() throws Exception {
			            return "Ya pasaron 10 segundos.";
			        }
			    }, 10, TimeUnit.SECONDS);
			 
			System.out.println(future.get());
			 
			executor.shutdown();
	}

	private static void conDelayAndPeriod() {
		ScheduledExecutorService execService = Executors.newScheduledThreadPool(5);
		execService.scheduleAtFixedRate(()->{

			System.out.println("Momento: "+ new java.util.Date());
		}, 0, 1000L, TimeUnit.MILLISECONDS);
	}

}

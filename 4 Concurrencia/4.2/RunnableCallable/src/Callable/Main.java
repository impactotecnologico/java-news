package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		try {
            ExecutorService servicio= Executors.newFixedThreadPool(1);
 
            Future<Integer> resultado= servicio.submit(new MiCallable());
            
//            System.out.println(resultado.isDone());
//            System.out.println(resultado.get());
            
            if(resultado.isDone()) {
            	System.out.println(resultado.get());
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


	}

}

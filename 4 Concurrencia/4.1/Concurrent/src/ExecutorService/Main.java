package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Main {

//	public static void main(String[] args) {
//        
//        Thread t1= new Thread(new Tarea("tarea1"));
//        t1.start();
//        Thread t2= new Thread(new Tarea("tarea2"));
//        t2.start();
//        Thread t3= new Thread(new Tarea("tarea3"));
//        t3.start();
// 
//    }
	
	public static void main(String[] args) {
		 
        Stream<String> flujo = Stream.of("tarea1", "tarea2", "tarea3");
 
        ExecutorService servicio = Executors.newCachedThreadPool();
     
        
        
        
        flujo.map(t->new Tarea(t)).forEach(servicio::execute);
        
    }


}

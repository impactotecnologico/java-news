import java.util.concurrent.CompletableFuture;

public class Demo {
	
	public static void main(String[] args) {
//		simple();
		
//		asincrono();
		
		StringBuilder result = new StringBuilder();
		CompletableFuture.completedFuture("Then Accept").thenAccept(s -> result.append(s));
		if (result.length() > 0)
			System.out.println("Result NO esta vacio");
		
	}

	private static void asincrono() {
		CompletableFuture cf = CompletableFuture.completedFuture("message").thenApply(s -> {
	        return s.toUpperCase();
	    });
		
		if ("MESSAGE".equals(cf.getNow(null))) {
			System.out.println("OK");
		}
	}

	private static void simple() {
		CompletableFuture cf = CompletableFuture.completedFuture("message");
	    System.out.println(cf.isDone());
	    System.out.println(cf.getNow(null));
	}

}

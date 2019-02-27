package streamsParalelos;

import java.util.stream.IntStream;

public class Principal {
	public static void main(String[] args) {
		long numero1 = System.currentTimeMillis();
		
		IntStream lista = IntStream.range(1,10);
		int total = lista.parallel().map(Principal::duplicar).sum();
		
		long numero2 = System.currentTimeMillis();
		System.out.println(numero2-numero1);
		System.out.println(total);
	}
	
	public static int duplicar(int numero) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println(ex);
		}
		
		return numero*2;
	}
}

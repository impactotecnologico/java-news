package DoubleFunction;

import java.util.function.DoubleFunction;

public class Main {

	public static void main(String[] args) {
		DoubleFunction<String> getGrado = nivel->{
			if(nivel>90 && nivel<=100){
				return "A";
			} else if(nivel>70 && nivel<=90){
				return "B";
			} else if(nivel>50 && nivel<=70){
				return "C";
			} else {
				return "D";
			}
		};
		
		double input = 91;
		System.out.println("Nivel de entrada: "+input);
		String grado = getGrado.apply(input);
		System.out.println("Grado : "+grado);

	}

}

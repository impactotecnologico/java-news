package intFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class Main {

	public static void main(String[] args) {
		IntFunction<String> getMonthOfTheYearName = mes -> {

			Map<Integer, String> meses = new HashMap<>();
			meses.put(1, "Enero");
			meses.put(2, "Febrero");
			meses.put(3, "MarMarzoch");
			meses.put(4, "Abril");
			meses.put(5, "Mayo");

			if (meses.get(mes) != null) {
				return meses.get(mes);
			} else {
				return "La entrada debe ser entre 1 y 5";
			}

		};

		int input = 1;
		String mesEncontrado = getMonthOfTheYearName.apply(input);
		System.out.println("Mes nro. " + input + " es : " + mesEncontrado);
	}

}

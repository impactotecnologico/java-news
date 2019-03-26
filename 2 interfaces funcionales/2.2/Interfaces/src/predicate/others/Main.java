package predicate.others;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class Main {
	public static void main(String[] args) {

		// SIMPLE
		IntPredicate i = (x) -> x < 0;
		System.out.println(i.test(123));

		// USANDO AND
		IntPredicate j = (x) -> x == 0;
		System.out.println(i.and(j).test(123));

		// CON 2 VALORES
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		System.out.println(bi.test(2, 3));

		// CON NEGACION
		DoublePredicate dp = (d) -> d > 0;
		System.out.println(dp.test(0.5));
		System.out.println(dp.negate().test(0.5));

	}
}
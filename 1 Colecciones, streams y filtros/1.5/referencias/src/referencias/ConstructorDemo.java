package referencias;

@FunctionalInterface
interface MiFunc{
	MiClase func(String s);
}

class MiClase{
	private static String str;
	MiClase(String s){
		str=s;
	}
	String getStr() {
		return str;
	}
}

public class ConstructorDemo {
	public static void main(String [] args) {
		MiFunc miFunc = MiClase::new;
		MiClase mc = miFunc.func("Prueba");
		System.out.println("str en mi clase: "+mc.getStr());
		System.out.println();
	}
}

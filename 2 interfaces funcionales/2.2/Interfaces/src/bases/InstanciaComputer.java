package bases;

public class InstanciaComputer {

	public static void main(String[] args) {
		Computer lambda = () -> {};

		Computer metodo = System::gc;

		Computer constructor = String::new;

	}

}

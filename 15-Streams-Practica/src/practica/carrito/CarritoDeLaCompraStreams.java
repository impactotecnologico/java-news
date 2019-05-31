package practica.carrito;

import java.util.Arrays;
import java.util.Collection;

public class CarritoDeLaCompraStreams {

	private Collection<Integer> precios;

	public CarritoDeLaCompraStreams(Collection<Integer> precios) {

		this.precios = precios;
	}

	public int calcularPrecioTotal() {
		int precioTotal = this.precios.stream().mapToInt(Integer::intValue).sum();
		return precioTotal;
	}

	public int calcularDescuentoTotal(int cantidadConDescuento) {
		
		return this.precios.stream().filter(precio -> precio.intValue() >= cantidadConDescuento).sorted()
				.mapToInt(precio -> precio*5/100 ).sum();//.forEach(p-> System.out.println(p));
		
		
	}

	public static void main(String[] args) {
		CarritoDeLaCompraStreams c = new CarritoDeLaCompraStreams(Arrays.asList(50, 100, 200, 45, 80));
		System.out.println(c.calcularPrecioTotal());

		System.out.println(c.calcularDescuentoTotal(100));
	}
}
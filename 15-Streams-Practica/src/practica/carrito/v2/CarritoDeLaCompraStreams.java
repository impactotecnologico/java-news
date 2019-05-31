package practica.carrito.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CarritoDeLaCompraStreams {

	private Collection<Optional<Producto>> productos;

	public CarritoDeLaCompraStreams(Collection<Optional<Producto>> productos) {

		this.productos = productos;
	}

	public int calcularPrecioTotal() {
		int precioTotal = this.productos.stream().filter(p -> p.isPresent()).mapToInt(p-> p.get().precio).sum();
		return precioTotal;
	}

	public int calcularDescuentoTotal(int cantidadConDescuento) {
		
		return this.productos.stream().filter(p -> p.isPresent()).filter(p -> p.get().getPrecio() >= cantidadConDescuento)
				.sorted()
				.mapToInt(p -> p.get().getPrecio()*5/100 ).sum();//.forEach(p-> System.out.println(p));

	}
	
	public boolean tieneProducto(String nombre) {
		return this.productos.stream().anyMatch(p->  p.isPresent() && p.get().getNombre().contains(nombre));
	}
	
	public boolean hayBaratos(int precio) {
		return this.productos.stream().anyMatch(p-> p.isPresent() && p.get().getPrecio() < precio);
	}

	public static void main(String[] args) {
		CarritoDeLaCompraStreams c = new CarritoDeLaCompraStreams(generateProductos());
		System.out.println(c.calcularPrecioTotal());

		//System.out.println(c.calcularDescuentoTotal(100));
		
		System.out.println(c.tieneProducto("ProductoXXXXXX"));
		
		System.out.println(c.hayBaratos(60));
	}
	
	static List<Optional<Producto>> generateProductos() {
		
		List<Optional<Producto>> prods = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			prods.add(Optional.of(new Producto(i,"Producto"+(i+1), (i+1)*100)));
			
		}
		
		prods.add(Optional.empty());
		
		return prods;
	}
}
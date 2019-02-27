package optionals;

public class Car {
	private String precio;
	
	public Car(String precio) {
		setPrecio(precio);
	}
	
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public String getPrecio() {
		return this.precio;
	}
	
	public String toString() {
		return "El precio del coche es de: " + getPrecio();
	}
}

package practica.carrito.v2;

public class Producto implements Comparable<Producto>{
	
	int id;
	String nombre;
	int precio;
	
	public Producto() {
	}
	
	
	public Producto(int id, String nombre, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}


	@Override
	public int compareTo(Producto o) {
		return  this.precio > o.getPrecio() ? +1 : this.precio < o.getPrecio() ? -1 : 0;
	}
	
	
	

}

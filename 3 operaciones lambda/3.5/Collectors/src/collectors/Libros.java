package collectors;

public class Libros {
	String titulo;
    int paginas;
     
     
    Libros(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    public String getTitulo() {
    	return this.titulo;
    }
    
    public int getPaginas() {
    	return this.paginas;
    }
    
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public void setPaginas(int paginas) {
    	this.paginas = paginas;
    }


}

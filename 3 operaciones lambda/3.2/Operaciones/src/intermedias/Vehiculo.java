package intermedias;

public class Vehiculo {
	private String placa;
    private String modelo;
    private int kilometros;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getKilometros() {
        return kilometros;
    }
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    public Vehiculo(String placa, String modelo, int kilometros) {
        super();
        this.placa = placa;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }
}

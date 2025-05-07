package joias_java.model;

public class Cordao extends Joias{
	
	private String modelo;

	public Cordao(int id, String nomeCliente, int tipo, String modelo) {
		super(id, nomeCliente, tipo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
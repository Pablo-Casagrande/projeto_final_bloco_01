package joias_java.model;

public abstract class Joias {

	private int id;
	private String nomeCliente;
	private int tipo;
	
	public Joias(int id, String nomeCliente, int tipo) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
}
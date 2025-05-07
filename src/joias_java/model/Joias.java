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
	
			public void visualizar() {

				String tipo = "";

				switch (this.tipo) {
				case 1 -> tipo = "Alianca";
				case 2 -> tipo = "Cordao";
				default -> tipo = "Inválido";
				}

				System.out.println("                                          ");
				System.out.println("************ DADOS DO PRODUTO ************");
				System.out.println("                                          ");
				System.out.println("ID do Produto: " + this.id);
				System.out.println("Nome do Cliente: " + this.nomeCliente);
				System.out.println("Tipo do Produto: " + tipo);
			}
	
	
}
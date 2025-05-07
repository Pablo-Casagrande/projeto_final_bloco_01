package joias_java.model;

public class Alianca extends Joias{

	private String nomeDoParceiro;

	public Alianca(int id, String nomeCliente, int tipo, String nomeDoParceiro) {
		super(id, nomeCliente, tipo);
		this.nomeDoParceiro = nomeDoParceiro;
	}

	public String getNomeDoParceiro() {
		return nomeDoParceiro;
	}

	public void setNomeDoParceiro(String nomeDoParceiro) {
		this.nomeDoParceiro = nomeDoParceiro;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do parceiro: " + this.nomeDoParceiro);
	}
}
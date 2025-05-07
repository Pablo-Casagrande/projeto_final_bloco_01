package joias_java.repository;

import joias_java.model.Joias;

public interface JoiasRepository {
	
	public void procurarPorId(int id);
	public void listarTodos();
	public void cadastrar(Joias Joias);
	public void atualizar(Joias Joias);
	public void deletar(int id);
	
}
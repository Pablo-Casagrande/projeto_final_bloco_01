package joias_java.controller;

import java.util.ArrayList;
import java.util.Optional;
import joias_java.model.Joias;
import joias_java.repository.JoiasRepository;

	public class JoiasController implements JoiasRepository {
		
			private ArrayList<Joias> listaJoias = new ArrayList<Joias>();

			int id = 0;

			@Override
			public void procurarPorId(int id) {
				
				Optional<Joias> joias = buscarNaCollection(id);
				
				if(joias.isPresent())
					joias.get().visualizar();
				else
					System.out.printf("\nA Joia %d nao foi encontrado", id);
				
			}


			@Override
			public void listarTodos() {
				for(var joias : listaJoias) {
					joias.visualizar();
				}
			}

			@Override
			public void cadastrar(Joias joias) {
				listaJoias.add(joias);
				System.out.println("A joia foi criado com sucesso!");
			}

			@Override
			public void atualizar(Joias joias) {
				Optional<Joias> buscaJoias = buscarNaCollection(joias.getId());
				
				if(buscaJoias.isPresent()) {
					listaJoias.set(listaJoias.indexOf(buscaJoias.get()), joias);
						System.out.printf("\nA Joia ID %d foi atualizado com sucesso!", joias.getId());
			}else
					System.out.printf("\nA Joia ID %d nao foi encontrado", joias.getId());
				
			}

			@Override
			public void deletar(int id) {
				Optional<Joias> joias = buscarNaCollection(id);
						
				if (joias.isPresent()) {
					if(listaJoias.remove(joias.get()) == true)
						System.out.printf("\nA Joia ID %d foi excluído com sucesso!", id);
				 } else
						System.out.printf("\nA Joia ID %d nao foi encontrado!", id);
				
			}

			
			
			public int gerarId() {
				return ++ id;
			}
			
			public Optional<Joias> buscarNaCollection(int id) {
				for(var joias : listaJoias) {
					if(joias.getId() == id)
						return Optional.of(joias);
				}
				return Optional.empty();
			}
		}
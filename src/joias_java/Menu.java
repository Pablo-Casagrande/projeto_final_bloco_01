package joias_java;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;
import joias_java.controller.JoiasController;
import joias_java.model.Alianca;
import joias_java.model.Cordao;
import joias_java.model.Joias;
import joias_java.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		JoiasController joias = new JoiasController();

		int opcao, id, tipo;
		String nomeCliente, nomeDoParceiro, modelo;

		
			
			while(true) {

				System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND
						          +"*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                      DIMI JOIAS                     ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Criar Joia                           ");
				System.out.println("            2 - Listar todas as Joias                ");
				System.out.println("            3 - Buscar Joia por Id                   ");
				System.out.println("            4 - Atualizar Dados da Joia              ");
				System.out.println("            5 - Apagar Dados da Joia                 ");
				System.out.println("            6 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\n********DIMI JOIAS - JOIAS DE QUALIDADE É AQUI!********");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
			
				case 1:
					System.out.println("Criar Joia\n\n");
					
					System.out.println("Digite o nome do Cliente: ");
                    leia.skip("\\R");
                    nomeCliente = leia.nextLine();
                    
                    System.out.println("Digite o tipo do Joias (1 - Alianca | 2 - Cordao: ");
                    tipo = leia.nextInt();
                            
                     
                     switch(tipo) {
                     case 1 ->{
                    	 	System.out.println("Digite o nome do Parceiro(a): ");
                    	 	leia.skip("\\R");
                    	 	nomeDoParceiro = leia.nextLine();
                    	 	joias.cadastrar(new Alianca(joias.gerarId(), nomeCliente, tipo, nomeDoParceiro));
                     	}	
                     
                     case 2 ->{
	                    	System.out.println("Digite o nome do modelo do Cordao: ");
	                 	 	leia.skip("\\R");
	                 	 	modelo = leia.nextLine();
	                 	 	joias.cadastrar(new Cordao(joias.gerarId(), nomeCliente, tipo, modelo));
                  	 	}     
                     }
                    
					keyPress();
					break;
					
				case 2:
					System.out.println("Listar todas as Joias\n\n");
					joias.listarTodos();
					keyPress();
					break;
					
				case 3:
					System.out.println("Buscar Joia por ID \n\n");
					
					System.out.println("Digite o ID da Joia: ");
                    id = leia.nextInt();               
                    joias.procurarPorId(id);
                    
					keyPress();
					break;
					
				case 4:
					System.out.println("Atualizar Dados da Joia\n\n");
					
					System.out.println("Digite o ID do Joias: ");
                    id = leia.nextInt();
                    
                    Optional<Joias> joia = joias.buscarNaCollection(id);

                   
                    if(joia.isPresent()) {
					
					System.out.println("Digite o nome do Cliente: ");
                    leia.skip("\\R");
                    nomeCliente = leia.nextLine();
                     
                    tipo = joia.get().getTipo();
                     
                    
                     
                    switch(tipo) {
                    case 1 ->{
                   	 	System.out.println("Digite o nome do Parceiro(a): ");                  	 	
                   	 	nomeDoParceiro = leia.nextLine();
                   	 	joias.atualizar(new Alianca(id, nomeCliente, tipo, nomeDoParceiro));
           		  	}	
                    
                    case 2 ->{
	                    	System.out.println("Digite o nome do modelo do Cordao: ");  
	                 	 	modelo = leia.nextLine();
	                 	 	joias.atualizar(new Cordao(id, nomeCliente, tipo, modelo));
                 	 	}     
                    }
                   
	
                    }else
                    	System.out.printf("\nA Joia de ID %d nao existe!", id);
                    
					keyPress();
					break;
					
				case 5:
					System.out.println("Apagar Dados da Joia\n\n");
					
					System.out.println("Digite o ID da Joia: ");
	                id = leia.nextInt();               
	                joias.deletar(id);
	                
					keyPress();
					break;
					
				case 6:
					System.out.println("Sair\n\n");
					sobre();
					leia.close();
					System.exit(0);
					keyPress();
					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}

    
	public static void sobre() {
		
		 System.out.println("╔═════════════════════════════════════════════════════════════════════════╗");
	     System.out.println("║                       SOBRE O PROJETO                                   ║");
	     System.out.println("╠═════════════════════════════════════════════════════════════════════════╣");
	     System.out.println("║ Desenvolvido por: Pablo Furtado Casagrande                              ║");
	     System.out.println("║ Email: furtadocasagrandepablo@gmail.com                                 ║");
	     System.out.println("║ GitHub: https://github.com/Pablo-Casagrande                             ║");
	     System.out.println("║ LinkedIn: linkedin.com/in/pablo-furtado-casagrande-08663434a/           ║");
	     System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
		
	}
	
	 public static void keyPress() {

	    	try {
	    		 
				System.out.println("\n\nPressione Enter para Continuar...");
				System.in.read();
	 
			} catch (IOException e) {
	 
				System.err.println("Ocorreu um erro ao tentar ler o teclado");
	 
			}
	 }
}
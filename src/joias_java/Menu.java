package joias_java;

import java.io.IOException;
import java.util.Scanner;

import joias_java.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		
			
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
					keyPress();
					break;
				case 2:
					System.out.println("Listar todas as Joias\n\n");
					keyPress();
					break;
				case 3:
					System.out.println("Buscar Joia por ID \n\n");
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar Dados da Joia\n\n");
					keyPress();
					break;
				case 5:
					System.out.println("Apagar Dados da Joia\n\n");
					keyPress();
					break;
				case 6:
					System.out.println("Sair\n\n");
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
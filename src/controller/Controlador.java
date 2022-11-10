package controller;

import java.util.Scanner;

import dao.LivroService;



public class Controlador {

	public static void main(String[] args) {
		LivroService lS=new LivroService();
		Scanner input=new Scanner(System.in);
		
		
		int opcion;
		
		
		do {
			System.out.println("\n###############################");
			System.out.println("1-CADASTRAR LIVRO");
			System.out.println("2-MODIFICAR LIVRO");
			System.out.println("3-PROCURAR LIVRO POR TITULO");
			System.out.println("4-PROCURAR LIVRO POR AUTOR");
			System.out.println("5-EXCLUIR LIVRO DA BIBLOTECA");
			System.out.println("6-LISTAR TODOS OS LIVROS");
			System.out.println("0-SAIR");
			System.out.println("###############################\n");
			opcion=input.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Nome do livro");
				input.nextLine();
				String nomeL=input.nextLine();
				
				System.out.println("Nome do autor");
				
				String nomeA=input.nextLine();
				
				System.out.println("estilo do livro");
				
				String estilo=input.nextLine();
				
				
				lS.salvar(nomeL, nomeA, estilo);
				
				break;
				
			case 2:
				System.out.println("nome do livro a ser modificado");
				input.nextLine();
				String titulo=input.nextLine();

				System.out.println("novo nome do livro :");
				String novoNome=input.nextLine();
				
				System.out.println("autor :");
				String novoAutor=input.nextLine();
				
				System.out.println("estilo :");
				String novoEstilo=input.nextLine();
				
				lS.modificar(titulo, novoNome, novoAutor, novoEstilo);
				
				break;
			
			case 3:
				System.out.println("nome do livro");
				input.nextLine();
				String nome=input.nextLine();
				
				lS.listarT(nome);
				
				break;
			case 4:
				System.out.println("nome do autor");
				input.nextLine();
				String autor=input.nextLine();
				
				lS.listarA(autor);
				
				break;
				
			case 5:
				System.out.println("digite o nome do livro a ser excluido");
				input.nextLine();
				String excluir=input.nextLine();
				
				lS.deletar(excluir);
				
				break;
				
			case 6:
				
				lS.listarTodos();
			
			}
			
		}while(opcion!=0);
		
		input.close();
		

	}

}

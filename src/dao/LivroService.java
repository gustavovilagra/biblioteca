package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.Option;

import modelo.Livro;

public class LivroService implements ILivro{
	List<Livro>lista=new ArrayList<>();
	@Override
	public void salvar(String nome,String autor,String estilo) {
		Livro l=new Livro();
		l.setNomeLivro(nome);
		l.setNomeAutor(autor);
		l.setEstilo(estilo);
		
		lista.add(l);
		System.out.println("\nlivro cadastrado com sucesso\n");
		
	}

	@Override
	public void modificar(String a,String b,String c,String d) {
		for(int i=0;i<lista.size();i++) {
			Boolean titulo=lista.get(i).getNomeLivro().contains(a);
			if(titulo) {
				lista.get(i).setNomeLivro(b);
				lista.get(i).setNomeAutor(c);
				lista.get(i).setEstilo(d);
				
				System.out.println("Livro modificado com sucesso");
				}else {
					System.out.println("Livro nao encontrado");
				}
			}
			
	
		
	}

	@Override
	public void  listarT(String t) {
		
		for(int i=0;i<lista.size();i++) {
			Boolean titulo=lista.get(i).getNomeLivro().contains(t);
			if(titulo) {
				System.out.println("\n LIVRO ENCONTRADO  \n\n"
						
								+"Nome :"+lista.get(i).getNomeLivro()+"\n"
								+"Autor :"+lista.get(i).getNomeAutor()+"\n"
							    +"Estilo :"+lista.get(i).getEstilo());
			
			}else {
				System.out.println("\nlivro nao encontrado");
			}
		}
	
	}

	@Override
	public void listarA(String a) {
		for(int i=0;i<lista.size();i++) {
			Boolean titulo=lista.get(i).getNomeAutor().contains(a);
			if(titulo) {
				System.out.println("_______________________");
				System.out.println("\n LIVRO ENCONTRADO  \n\n"
						
								+"Nome :"+lista.get(i).getNomeLivro()+"\n"
								+"Autor :"+lista.get(i).getNomeAutor()+"\n"
							    +"Estilo :"+lista.get(i).getEstilo());
			
			}
		}
		
		
	}

	@Override
	public void deletar(String d) {
		for(int i=0;i<lista.size();i++) {
			Boolean titulo=lista.get(i).getNomeLivro().contains(d);
			if(titulo) {
				lista.remove(i);
				System.out.println("\n livro removido");
			}
			
		}
		
	}

	@Override
	public void listarTodos() {
		for(int i=0;i<lista.size();i++) {
			
			System.out.println("______________________________");
			System.out.println("nome do livro :"+lista.get(i).getNomeLivro());
			System.out.println("autor :"+lista.get(i).getNomeAutor());
			System.out.println("estilo :"+lista.get(i).getEstilo());
			System.out.println("______________________________");
		
	}
	
		
	}

}

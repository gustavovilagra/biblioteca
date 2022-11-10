package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.Option;

import modelo.Livro;

public interface ILivro {
	
	public void salvar(String nome,String autor,String estilo);
	
	public void modificar(String a,String b,String c,String d);
	
	public void listarT(String t);
	
    public void listarA(String a);
	
	public void listarTodos();
	
	public void deletar(String d);
}

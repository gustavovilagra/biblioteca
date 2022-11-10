package modelo;

public class Livro {
	private String nomeLivro;
	private String nomeAutor;
	private String estilo;
	
	public Livro() {
		
	}

	public Livro(String nomeLivro, String nomeAutor, String estilo) {
		super();
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
		this.estilo = estilo;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", nomeAutor=" + nomeAutor + ", estilo=" + estilo + "]";
	}

}

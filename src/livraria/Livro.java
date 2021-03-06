package livraria;

public class Livro {
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	Autor autor;
	private boolean impresso;
	
	public Livro(Autor autor){
		this.autor = autor;	
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;
	}
	
	public Livro() {
		
	}
	
	void mostrarDetalhes() {
		
		System.out.println(" Detalhes do Livro");
		System.out.println("Nome: "+ nome);
		System.out.println("Valor: "+valor);	
		System.out.println("Descri??o: " +descricao);
		System.out.println("ISBN: " +isbn);
		
		if (this.temAutor()) { 
		autor.mostrarDetalhes();
		}
		
		System.out.println("------------------");
	}
	
	
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}else if(!this.impresso && porcentagem>0.15) {
		return false;	
		}		
		this.valor-= this.valor * porcentagem;
		return true;
	}
	
	boolean temAutor() {
		return this.autor != null;
	} 
	
	
/* C?digo das p?ginas 59 e 60	
	void adicionValor(double valor) {
		this.valor=valor;
	}
	
	double retornaValor() {
		return this.valor; 

	} */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	
	
}
	


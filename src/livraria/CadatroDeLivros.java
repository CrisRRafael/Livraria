package livraria;

public class CadatroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@gmail.com");
 		autor.setCpf("123.456.789.10");
		
		
		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da Linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
				
				
		livro.mostrarDetalhes();
		 
				 
		Autor oautor = new Autor();
		oautor.setNome("Paulo Silveira");
		oautor.setEmail("paulo.silveira@gmail.com");
		oautor.setCpf("109.876.543-21");
		
		
		Livro outrolivro = new Livro(oautor);
		outrolivro.setNome("Lógica de Programação");
		outrolivro.setDescricao("Crie seus primeiros programas");
		outrolivro.setIsbn("978-85-66250-22-0");
		livro.setValor(59.90);
				
		
		outrolivro.mostrarDetalhes();
		
		
}
	
	
	
}
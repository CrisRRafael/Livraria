package livraria;

public class RegrasDeDesconto {
	
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		
		/*// C�digo das p�ginas 55 a 57
		livro.valor = 59.90;
		
		System.out.println("Valor atual: " +livro.valor);
		
		if(!livro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto n�o pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto: "+livro.valor);
		}
		
		*/
		
		
		System.out.println("valor atual: " + livro.getValor());
		
		if(livro.aplicaDescontoDe(0.01)){
			System.out.println("Desconto n�o pode ser maior do que 30%");
		}
		else {
			System.out.println("Valor com desconto: "+ livro.getValor());
		}
	}
		
	}



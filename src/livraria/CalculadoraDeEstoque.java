package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		/*//**************P�ginas 11 a 20
		
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total da soma � " +soma);		
		
		if (soma<150) {
			System.out.println("Seu estoque est� muito baixo");
		} else if (soma>=2000) {
			System.out.println("Seu estoque est� muito alto");
		} else {
			System.out.println("Seu estoque est� bom");
		}

		//*****************************    */
		
		//********************** P�ginas 21 a 23 
		/*
		double soma = 0;
		int contador = 0;
		
		
		while(contador<35) {
			double valorDoLivro= 59.90;
			// soma =soma+ valorDoLivro; o mesmo que
			soma+=valorDoLivro;
			//contador = contador+1; o mesmo que
			// contador =+1; ou tamb�m
			contador ++;
		}
		
		System.out.println("O total da soma � " +somaa);	
				
		if (soma<150) {
			System.out.println("Seu estoque est� muito baixo");
		} else if (soma>=2000) {
			System.out.println("Seu estoque est� muito alto");
		} else {
			System.out.println("Seu estoque est� bom");
		}
		
		//********************************
*/
		
		//*************** P�ginas 24 a 
		
		
		
		
		double soma = 0;
		
		for(double i=0; i<35; i++) {
			soma +=59.90;
		}
		
		System.out.println("O total da soma � " +soma);	
		
		if (soma<150) {
			System.out.println("Seu estoque est� muito baixo");
		} else if (soma>=2000) {
			System.out.println("Seu estoque est� muito alto");
		} else {
			System.out.println("Seu estoque est� bom");
		}
		
		
	}

}

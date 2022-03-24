package livraria;

public class ContinueEBreak {
	
	public static void main(String[] args) {
		for(int i =0; i<=10; i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int a =0; a<=10; a++) {
			if(a==7) {
				break;
			}
			System.out.println(a);
		}
	}

}

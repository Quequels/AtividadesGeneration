package exerciciosEntradaSaida;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			//variaveis
			float n1, n2,n3,n4, media;
			
			Scanner leia = new Scanner(System.in);
			
			
			//entrada de dados
			System.out.println("Digite 1° nota ");
			n1 = leia.nextFloat();
			
			System.out.println("Digite 2° nota ");
			n2 = leia.nextFloat();
			
			System.out.println("Digite 3° nota ");
			n3 = leia.nextFloat();
			
			System.out.println("Digite 4° nota ");
			n4 = leia.nextFloat();
			
			//processamento
			
			media = (n1 + n2 + n3 + n4) / 4.0f;
			
			// saida 
			
			System.out.println("A média das notas é: " + media);
		
	}

}

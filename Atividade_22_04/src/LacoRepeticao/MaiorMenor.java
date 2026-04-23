package LacoRepeticao;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		//Declaracao de variaveis
		int A,B,C,soma;
		
		Scanner leia = new Scanner(System.in);
	
		//entrada
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();

		//processamento e saida
		
		 soma = A + B ;
		
		 
		if(soma > C ) {
			System.out.println("C é menor que A + B");
		}
		else if(soma == C ) {
			System.out.println("C igual á A + B");
		}
		else {
			System.out.println("C maior que A + B" );
		}
		
		
	}

}

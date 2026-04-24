package exerciciosEntradaSaida;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variaveis
		
				float n1,n2,n3,n4, diferenca ; 
				
				Scanner leia = new Scanner(System.in);
				
				//entrada de dados
				
	
				System.out.println("Digite 1° numero : ");
				n1 = leia.nextFloat();
				
				System.out.println("Digite 2° numero:  ");
				n2 = leia.nextFloat();
				
				System.out.println("Digite 3° numero: ");
				n3 = leia.nextFloat();
				
				System.out.println("Digite 4° numero: ");
				n4 = leia.nextFloat();
				
				//processamento
				
				diferenca = (n1 * n2) - (n3 * n4);
				
				//saida
				System.out.println(diferenca);
	}

}

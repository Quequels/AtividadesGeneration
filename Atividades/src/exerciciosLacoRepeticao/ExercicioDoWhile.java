package exerciciosLacoRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int num;
			int soma = 0;
			
			do {
				System.out.println("Digite um número: (Digite 0 para parar) ");
				num = leia.nextInt();
				
				if(num > 0) {
					soma = soma + num;
					
				}
				
				
			}while(num != 0);
			
			System.out.println("Quantidade de números digitados: " + soma);
		}
	}



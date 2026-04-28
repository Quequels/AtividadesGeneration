package exerciciosLacoRepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		int num,contador;
		int par = 0, impar = 0;
		
		
		for(contador =1 ; contador <= 10; contador++) {
			System.out.println("Digite "+contador+"ºNúmero:");
			num = leia.nextInt();
			
			if(num % 2 == 0 ) {
				par++;
			}
			else if(num % 2 != 0) {
				impar ++;
			}
			
		}
		System.out.println("Numeros pares:" + par);
		System.out.println("Numeros impares:"+ impar);
		
	}
	}



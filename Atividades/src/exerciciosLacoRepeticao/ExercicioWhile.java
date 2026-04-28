package exerciciosLacoRepeticao;

import java.util.Scanner;

public class ExercicioWhile {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int idade =0;
	int maior =0;
	int menor =0;
	
	while(idade >= 0) {
		
		System.out.println("Digite a sua idade: (Digite um número negativo para parar) ");
		idade = leia.nextInt();
		
		if(idade > 0 && idade < 21) {
			menor++;
		}
		else if(idade > 50) {
			maior++;
		}
		
		
	}
	System.out.println("Total de pessoas maiores de 50 anos: " +maior );
	System.out.println("Total de pessoas menores de 21: " + menor);
	}
}

package exercicioVetor;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
	

		int vetorNumeros [] = {2,5,1,3,4,9,7,8,10,6};
		int contador;
		
		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1 ; contador < 9; contador ++) {
			System.out.println("Digite o número que você deseja encontrar:");
			contador = leia.nextInt(); 
			Arrays.sort(vetorNumeros);
			
			int posicao = Arrays.binarySearch(vetorNumeros, contador);
			
			if (posicao >= 0 )
				System.out.println("\nO número " + contador+" foi Encontrado e está na Posição: " + posicao);
			else
				System.out.println("\nO número "+contador+" não foi40 encontrado!");
		}
		
	}
}




package exercicioCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		int numeros;
		
		while(setNumeros.size() < 10) {
			System.out.println("Digite um Número");
			numeros = leia.nextInt();
			
			setNumeros.add(numeros);
		}
		
		Iterator<Integer> it = setNumeros.iterator();
		System.out.println("Listar dados do set:");
		while(it.hasNext()) {
			System.out.println( it.next());
		}
		
	}

}

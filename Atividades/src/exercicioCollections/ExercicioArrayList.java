package exercicioCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ExercicioArrayList {

	public static void main(String[] args) {
		//declarando variaveis
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		int lista;
		
		//entrada de dados
		for (lista =1; lista < 6; lista++) {
			System.out.println("Digite a" + lista + "º cor:" );
			cores.add (leia.next());
			
		}
		
		 System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
			
	     Collections.sort(cores);
	     System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
		
		

		
		
	}

}

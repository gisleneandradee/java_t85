package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		System.out.println("O objeto que está presente no indice 1: " + numeros.get(1));
		System.out.println("O indice do objeto 1: " + numeros.indexOf(1));
		
		numeros.set(3, 25);
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(0);
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		numeros.sort(null); //Ordem crescente
		numeros.sort(Comparator.reverseOrder()); //Ordem decrescente
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
	}

}

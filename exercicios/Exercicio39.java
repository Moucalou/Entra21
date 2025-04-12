package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		
		int cont = 0;
		
		lista.add(7);
		lista.add(10);
		lista.add(9);
		lista.add(10);
		lista.add(9);
		lista.add(10);
		
		for (int i = 0; i < lista.size(); i++) {
			if (!lista2.contains(lista.get(i))) {
				lista2.add(lista.get(i));
			}
		}
		
		for (int i = 0; i < lista2.size(); i++) {
			for (int j = 0; j < lista.size(); j++) {
				if (lista2.get(i) == lista.get(j)) {
					cont++;
				}
			}
			
			System.out.println("O numero " + lista2.get(i) + " apareceu " + cont + " vezes");
			cont = 0;
		}
		
		

	}

}

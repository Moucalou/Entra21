package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio36 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();

		lista.add(7);
		lista.add(10);
		lista.add(9);
		
		int cont = 0;
		
		for (int i = 1; i < lista.size(); i++) {
			if (lista.get(i - 1) > lista.get(i)) {
				System.out.println("Não está crescente");
				return;
			}
		}
		System.out.println("Crescente");

	}

}

package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio24 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		int soma = 0, cont = 0;
		double media;
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(7);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 != 0) {
				soma += lista.get(i);
				cont++;
			}
		}

		media = (double) soma / cont;

		System.out.println(media);
	}

}

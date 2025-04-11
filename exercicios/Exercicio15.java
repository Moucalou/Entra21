package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio15 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		int media, soma = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}

		media = soma / lista.size();
		
		System.out.println(media);
	}

}

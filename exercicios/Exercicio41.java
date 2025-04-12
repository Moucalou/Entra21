package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio41 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		for (int i = 0; i < lista.size(); i++) {
			if (i == 0) {
				lista2.add(lista.getLast());
			} else if (i > 0 && i < lista.size()) {
				lista2.add(lista.get(i - 1));
			}
		}
		
		lista.removeAll(lista);
		
		for (int i = 0; i < lista2.size(); i++) {
			lista.add(lista2.get(i));
		}

		System.out.println(lista);
	}

}

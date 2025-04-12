package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio37 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();

		int moda = 0, cont = 0, contmaior = 0;
		lista.add(7);
		lista.add(10);
		lista.add(9);
		lista.add(10);
		lista.add(9);
		lista.add(10);
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(i) == lista.get(j)) {
					cont++;
				}
			}
			if (cont > contmaior) {
				contmaior = cont;
				moda = lista.get(i);
			}
		}
		
		System.out.println(moda);

	}

}

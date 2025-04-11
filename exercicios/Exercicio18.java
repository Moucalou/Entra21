package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio18 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(-1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(-6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(-10);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < 0) {
				lista.remove(i);
			}
		}

		System.out.println(lista);
	}

}

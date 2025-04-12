package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio43 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();

		int x = 4;
		
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(7);
		lista.add(1);
		lista.add(2);
		lista.add(5);
		lista.add(6);
		lista.add(8);
		
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > x) {
				lista.remove(i);
				i--;
			}
		}
		
		System.out.println(lista);
		
	}

}

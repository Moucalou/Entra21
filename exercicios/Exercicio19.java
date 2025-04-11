package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio19 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		int multi;
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		int n = lista.size();
		
		for (int i = 0; i < n; i++) {
			multi = lista.get(i) * 2;
			lista.add(multi);
		}

		System.out.println(lista);
	}

}

package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio31 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();
		
		lista.add(1);
		lista.add(3);
		lista2.add(2);
		lista2.add(4);
		
		for (int i = 0; i < lista.size(); i++) {
			lista3.add(lista.get(i));
			lista3.add(lista2.get(i));
		}
		
		System.out.println(lista3);

	}

}

package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio21 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(4);
		lista.add(3);
		lista.add(5);
		lista.add(2);
		
		Collections.sort(lista.reversed());
		
		System.out.println(lista);

	}

}

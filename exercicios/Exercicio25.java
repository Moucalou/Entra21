package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio25 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		int multi, x = 4;
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(7);
		
		for (int i = 0; i < lista.size(); i++) {
			multi = x * lista.get(i);
			System.out.println(multi);
		}

	}

}

package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio40 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();
		
		int maior = 0;

		
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(7);
		lista2.add(1);
		lista2.add(2);
		lista2.add(5);
		lista2.add(6);
		lista2.add(8);
		
		if (lista.size() > lista2.size()) {
			maior = lista.size();
		} else {
			maior = lista2.size();
		}
		
		for (int i = 0; i < maior; i++) {
			lista3.add(lista.get(i));
			lista3.add(lista2.get(i));
			Collections.sort(lista3);
		}
		
		System.out.println(lista3);
		
//		for (int i = 0; i < lista.size(); i++) {
//			lista3.add(lista.get(i));
//		}
//		for (int i = 0; i < lista2.size(); i++) {
//			lista3.add(lista2.get(i));
//		}
//		
//		for (int i = 0; i < lista3.size(); i++) {
		

	}

}

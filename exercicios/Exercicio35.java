package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio35 {

	public static void main(String[] args) {
		
		List<Integer> list5um = new ArrayList<>();
		List<Integer> list5dois = new ArrayList<>();
		List<Integer> list5tres = new ArrayList<>();
		
		list5um.add(2);
		list5um.add(3);
		list5um.add(4);
		list5dois.add(7);
		list5dois.add(5);
		list5dois.add(6);
		
		for (int i = 0; i < list5um.size(); i++) {
			list5tres.add(list5um.get(i) * list5dois.get(i));
		}

		System.out.println(list5tres);
	}

}

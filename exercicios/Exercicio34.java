package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio34 {

	public static void main(String[] args) {
		
		List<Integer> list5um = new ArrayList<>();
		List<Integer> list5dois = new ArrayList<>();
		List<Integer> list5tres = new ArrayList<>();
		
		list5um.add(2);
		list5um.add(5);
		list5um.add(3);
		list5um.add(4);
		list5dois.add(2);
		list5dois.add(5);
		list5dois.add(6);
		
		for (int i = list5um.size() -1; i >= 0; i--) {
			if (list5dois.contains(list5um.get(i))) {
				list5um.remove(list5um.get(i));
			}
		}

		System.out.println(list5um);
	}

}

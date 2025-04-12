package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio33 {

	public static void main(String[] args) {
		
		List<Integer> list5um = new ArrayList<>();
		List<Integer> list5dois = new ArrayList<>();
		List<Integer> list5tres = new ArrayList<>();
		
		list5um.add(2);
		list5um.add(5);
		list5um.add(3);
		list5dois.add(2);
		list5dois.add(5);
		list5dois.add(6);
		
		for (int i = 0; i < list5um.size(); i ++) {
			for (int j = 0; j < list5dois.size(); j++) {
				if (list5um.get(i) == list5dois.get(j)) {
					list5tres.add(list5um.get(i));
				}
			}
		}
		
		System.out.println(list5tres);
	}

}

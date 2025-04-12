package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Character> list = new ArrayList<>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		list.add('g');
		list.add('h');
		list.add('i');
		list.add('j');
		list.add('k');
		list.add('l');
		list.add('m');
		list.add('n');
		list.add('o');
		list.add('p');
		list.add('q');
		list.add('r');
		list.add('s');
		list.add('t');
		list.add('u');
		list.add('v');
		list.add('w');
		list.add('x');
		list.add('y');
		list.add('z');
		
		System.out.println("Digite 2 caracteres");
		char first = sc.next().charAt(0);
		char second = sc.next().charAt(0);
		
		int cont = 0;
		
		if (list.indexOf(first) > list.indexOf(second)) {
			System.out.println("Erro!");
		} else {
			for (int i = (list.indexOf(first) + 1); i < list.indexOf(second); i++) {
				cont++;
			}
			System.out.println(cont);
		}
		
		

	}

}

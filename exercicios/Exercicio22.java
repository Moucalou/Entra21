package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list3dois = new ArrayList<>();
		
		System.out.print("Digite o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			int numero = sc.nextInt();
			list3.add(numero);
		}
		
		for (int i = 0; i < list3.size(); i++) {
			if (!list3dois.contains(list3.get(i))) {
				list3dois.add(list3.get(i));
			}
		}
		
		System.out.println("Lista " + list3dois);

		sc.close();
	}

}

package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		List<Integer> primos = new ArrayList<>();
		
		System.out.print("Digite um numero A: ");
		int A = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite um numero B: ");
		int B = sc.nextInt();
		int cont = 0;
		
		for (int i = A; i <= B; i++) {
			lista.add(i);
		}
		
		for (int i = 2; i < lista.size(); i++) {
			for (int j = 2; j < lista.get(i); j++) {
				if (lista.get(i) % j == 0) {
					cont++;
				}
			}
			
			if (cont == 0) {
				primos.add(lista.get(i));
			}
			cont = 0;
		}
		
		System.out.println(primos.size());

	}

}

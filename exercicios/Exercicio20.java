package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			int numero = sc.nextInt();
			lista.add(numero);
		}
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
		sc.close();
	}

}

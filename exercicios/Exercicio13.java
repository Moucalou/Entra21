package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		int numero, maior = 0, menor;
		
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			lista.add(numero);
		}
		
		menor = lista.get(1);
		
		for (int i = 0; i < N; i++) {
			if (menor > lista.get(i)) {
				menor = lista.get(i);
			} else if (maior < lista.get(i)) {
				maior = lista.get(i);
			}
		}
		
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
			
		sc.close();
	}

}

package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Informe o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		int numero;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			lista.add(numero);
		}
		
		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
		sc.close();
	}

}

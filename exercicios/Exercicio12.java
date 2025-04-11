package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o " + (i + 1) + "º numero: ");
			int numero = sc.nextInt();
			lista.add(numero);
			soma += lista.get(i);
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			soma += i + 1;
		}

		System.out.println(soma);
	}

}

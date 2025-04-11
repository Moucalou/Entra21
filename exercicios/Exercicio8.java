package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		int cont = 0;
		
		for (int i = 2; i < N; i++) {
			if (N % i == 0) {
				cont++;
			}
		}
		
		if (cont == 0) {
			System.out.println(N + " é Primo");
		}
		else {
			System.out.println(N + " não é Primo");
		}
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int N = sc.nextInt();
		
		for (int i = 0; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		int soma = 0;
		double elevar;
		
		for (double i = 1; i <= N; i++) {
			elevar = Math.pow(i, 2.0);
			soma += elevar;
		}
		
		System.out.println(soma);

	}

}

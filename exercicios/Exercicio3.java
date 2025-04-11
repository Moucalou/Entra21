package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		int tabuada = 0;
		
		for (int i = 0; i < 10; i++) {
			tabuada = N * (i + 1);
			System.out.println(N + " x " + (i + 1) + " = " + tabuada);
		}

	}

}

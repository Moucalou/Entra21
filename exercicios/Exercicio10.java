package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		
		for (int i = N; i >= 0; i--) {
			System.out.println(i);
		}
		
	}

}

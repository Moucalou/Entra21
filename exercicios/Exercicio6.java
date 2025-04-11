package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		
		int resultado = 1;
		
		for (int i = N; i > 0; i--) {
			resultado = resultado * i;
		}
		
		System.out.println(resultado);
	}

}

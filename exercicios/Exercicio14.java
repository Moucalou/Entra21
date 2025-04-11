package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		System.out.print("Digite o tamanho da lista: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i ++) {
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				soma++;
			}
		}
		
		System.out.println(soma);

		sc.close();
	}

}

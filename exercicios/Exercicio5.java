package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		
		int i = 0;
		
		while (i <= N) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}

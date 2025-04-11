package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		
		int[] fibo = new int[N];
		
		int i = 1;
		
		fibo[0] = 0;
		for (i = 1; i < N; i++) {
			while (i > 0 && i < 3) {
				fibo[i] += 1;
				i++;
			}
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		
		for (i = 0; i < N; i++) {
			System.out.println(fibo[i]);
		}
		
	}

}

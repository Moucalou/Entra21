package exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int N = sc.nextInt();
		sc.nextLine();
		
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
		
		i = 0;
			while (i< fibo.length && fibo[i] <= N) {
			System.out.println(fibo[i]);
			i++;
			}
		
	}

}

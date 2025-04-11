package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite um numero: ");
		int N = sc.nextInt();
		
        int soma = 0;
        while (N > 0) {
        	soma += N % 10;
        	N /= 10;
        }
        
        System.out.println("A soma dos dígitos é: " + soma);
        
        sc.close();
	}
}
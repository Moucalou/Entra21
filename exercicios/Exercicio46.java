package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		System.out.println("Digite um numero: ");
		int N = sc.nextInt();
		
		int N2 = N;
		
        int soma = 0;
        while (N > 0) {
        	soma += N % 10;
        	lista.add(N % 10);
        	N /= 10;
        }
        
        Integer[] numeros = new Integer[lista.size()];
        
        lista.toArray(numeros);
        
        soma = 0;
        for (int i = 0; i < numeros.length; i++) {
        	soma += Math.pow(lista.get(i), lista.size());
        }

        if (soma == N2) {
        	System.out.println("Numero de Armstrong");
        }
	}

}

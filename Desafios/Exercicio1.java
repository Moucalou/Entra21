package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> tasks = new ArrayList<>();
		List<String> status = new ArrayList<>();
		
		System.out.println("===== LISTA DE TAREFAS =====");
		System.out.println("1 - Adicionar nova tarefa");
		System.out.println("2 - Listar tarefas");
		System.out.println("3 - Marcar tarefa como concluída");
		System.out.println("4 - Remover tarefa");
		System.out.println("0 - Sair");
		System.out.print("Escolha uma opção: ");
		int option = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		while (option != 0) {
			
			switch (option) {
				case 1:
					System.out.print("Digite a descrição da tarefa: ");
					String description = sc.nextLine();
					tasks.add(description);
					status.add("PENDENTE");
					System.out.println("Tarefa adicionada com sucesso! ");
					break;
				case 2:
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println("[" + (i + 1) + "] " + tasks.get(i) + " - " + status.get(i));
					}
					break;
				case 3:
					System.out.print("Qual tarefa você concluiu? ");
					int done = sc.nextInt();
					status.set(done - 1, "CONCLUIDA");
					break;
				case 4:
					System.out.print("Qual tarefa você quer remover? ");
					int remove = sc.nextInt();
					sc.nextLine();
					tasks.remove(remove - 1);
					status.remove(remove - 1);
				
			}
			System.out.println("===== LISTA DE TAREFAS =====");
			System.out.println("1 - Adicionar nova tarefa");
			System.out.println("2 - Listar tarefas");
			System.out.println("3 - Marcar tarefa como concluída");
			System.out.println("4 - Remover tarefa");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			option = sc.nextInt();
			sc.nextLine();
			System.out.println();
		}

	}

}

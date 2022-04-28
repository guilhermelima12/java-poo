package exercicioCombate;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite os dados do Primeiro campeão: ");
		System.out.print("Nome: ");
		String nome1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		
		System.out.println();
		
		
		System.out.println("Digite os dados do Segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		
		Champion champion1 = new Champion(nome1, life1, ataque1, armor1);
		Champion champion2 = new Champion(nome2, life2, ataque2, armor2);
		
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		int turnos = sc.nextInt();
		int cont = 0;
		

		while (cont < turnos) {
			
			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				break;				
			} else {
				champion1.takeDamage(champion2);
				champion2.takeDamage(champion1);
				
				System.out.println(champion1.status()); 
				System.out.println(champion2.status());
				
				System.out.println();
				cont++;
			}
		}
		
		System.out.println("FIM DO COMBATE");
		
		
		
		sc.close();
	}

}

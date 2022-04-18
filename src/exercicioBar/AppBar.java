package exercicioBar;

import java.util.Locale;
import java.util.Scanner;

public class AppBar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bar cliente = new Bar();
		
		System.out.print("Sexo: ");
		cliente.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		cliente.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		cliente.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		cliente.barbecue = sc.nextInt();
		
		cliente.report();
		
		
		sc.close();
	}

}

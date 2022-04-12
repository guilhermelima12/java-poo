package exercicioRetangulo;

import java.util.Scanner;
import java.util.Locale;

public class AppRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rect = new Retangulo();
		System.out.println("Entre com a largura e altura do retângulo:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f", rect.diagonal());
		
		sc.close();
	}

}

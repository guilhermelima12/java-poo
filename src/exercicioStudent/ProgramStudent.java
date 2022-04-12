package exercicioStudent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		stu.name = sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", stu.notaFinal());
		
		if (stu.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS", stu.pontosFaltantes());
		} else {
			System.out.println("APROVADO");
		}
		
		sc.close();

	}

}

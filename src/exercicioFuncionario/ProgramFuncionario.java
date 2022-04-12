package exercicioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Funcionario func = new Funcionario();
		System.out.print("Nome: ");
		func.name = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		func.tax = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.print("Qual a porcentagem para aumentar o sal�rio? ");
		double percent = sc.nextDouble();
		func.increasedSalary(percent);
		
		System.out.print("Dados atualizados: " + func);
		
		sc.close();

	}

}

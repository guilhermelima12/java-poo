package contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.ENGLISH);
		
		
		System.out.print("Quantos Contribuintes você vai digitar? ");
		int qnt = sc.nextInt();
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		System.out.println();
		Double salaryA;
		Double service;
		Double capital;
		Double med;
		Double edca;
		
		for (int i = 0; i < qnt; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			salaryA = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			service = sc.nextDouble();
			System.out.print("Renda anual com ganhos de capital: ");
			capital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			med = sc.nextDouble();
			System.out.print("Educacionais: ");
			edca = sc.nextDouble();
			TaxPayer payer = new TaxPayer(salaryA, service, capital, med, edca);
			list.add(payer);
			System.out.println();
		}
		
		for (TaxPayer x : list) {
			System.out.println("Resumo do " + (list.indexOf(x) + 1) +"º contribuinte:");
			System.out.printf("Imposto bruto total: %.2f%n", x.grossTax());
			System.out.printf("Abatimento: %.2f%n", x.taxRebate());
			System.out.printf("Imposto devido: %.2f%n", x.netTax());
			System.out.println();
		}
		
		sc.close();
	}

}

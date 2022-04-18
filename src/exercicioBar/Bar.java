package exercicioBar;

public class Bar {
	char gender;
	int beer;
	int barbecue;
	int softDrink;
	
	
	public double cover() {
		double couvert = 0.0;
		if (feeding() > 30) {
			couvert = 0.0;
		} else {
			couvert = 4.0;
		}
		
		return couvert;
	}
	
	public double ticket () {
		double value = 0;
		
		if (gender == 'F') {
			value = 8;
		} 
		
		if (gender == 'M') {
			value = 10;
		}
		
		return value;
	}
	
	public double feeding() {
		return (double) (beer * 5) + (softDrink * 3) + (barbecue * 7); 
	}
	
	public double total() {
		double consumo = feeding();
		double couvert = cover();
		double tick = ticket();
		return consumo + couvert + tick;
	}	
	
	public void report() {
		double couvert = cover();
		
		if (couvert == 0) {
			System.out.println("");
			System.out.println("RELATÓRIO");
			System.out.printf("Consumo: R$%.2f%n", feeding());
			System.out.println("Isento de couvert");
			System.out.printf("Ingresso: R$%.2f%n", ticket());
			
			System.out.println("");
			System.out.printf("Valor a pagar: R$%.2f", total());
		} else {
			System.out.println("");
			System.out.println("RELATÓRIO");
			System.out.printf("Consumo: R$%.2f%n", feeding());
			System.out.printf("Couvert: R$%.2f%n", couvert);
			System.out.printf("Ingresso: R$%.2f%n", ticket());
			
			System.out.println("");
			System.out.printf("Valor a pagar: R$%.2f", total());
		}
	}
	
}	

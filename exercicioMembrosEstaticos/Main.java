package exercicioMembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		
	
		System.out.println("Whats the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollar will be bought? ");
		double quantityInDollars = sc.nextDouble();
		
		double totalInReaisToPay = CurrencyConverter.convert(dollarPrice, quantityInDollars);
		System.out.printf("Amount to be paid in reais =  %.2f", totalInReaisToPay );

		sc.close();
	}

}

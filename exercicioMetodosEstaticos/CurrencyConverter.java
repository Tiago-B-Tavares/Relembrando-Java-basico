package exercicioMembrosEstaticos;

public class CurrencyConverter {
	
	public static final double TAX = 0.06;

	public static double convert(double dollarPrice, double quantityInDollars) {
		double convertion = dollarPrice * quantityInDollars;
		double valueReal = convertion + (convertion * TAX);

		return valueReal;
	}
}

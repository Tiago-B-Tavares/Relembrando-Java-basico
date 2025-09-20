package exercicioIntroducaoOO;


import java.util.Locale;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		Double Area = rectangle.Area(rectangle.height, rectangle.width);
		
		Double Perimeter = rectangle.Perimeter(rectangle.height, rectangle.width);
		
		Double Diagonal = rectangle.Diagonal(rectangle.height, rectangle.width);
		
		System.out.printf("AREA = %.2f",  Area );
		System.out.printf("\n");
		System.out.printf("PERIMETER =  %.2f", Perimeter);
		System.out.printf("\n");
		System.out.printf("DIAGONAL =  %.2f", Diagonal);

		
		sc.close();
	}

}

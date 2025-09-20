package exercicioGettersSetters;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Account account;

		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String accountHolder = sc.nextLine();

		System.out.println("Is there an initial deposit(y/n)?");
		char hasInitialDeposit = sc.next().charAt(0);

		if (hasInitialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);

		} else {
			account = new Account(accountNumber, accountHolder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated data: ");
		System.out.println(account);

		sc.close();
	}

}

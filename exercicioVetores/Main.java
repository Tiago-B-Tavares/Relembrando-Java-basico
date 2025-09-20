package exercicioVetores;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    private static Person[] p;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        Person[] p = new Person[n];

        String name;
        int age;
        double height;
        double sumHeight = 0;
        double underSixteen = 0;
        double percentUnderSixteen = 0;

        for (int i = 0; i < p.length; i++) {

            System.out.print("Dados da " + (i + 1) + "ª pessoa: \n");

            System.out.print("Nome: ");
            name = sc.nextLine();

            sc.nextLine();

            System.out.print("Idade: ");
            age = sc.nextInt();

            System.out.print("Altura: ");
            height = sc.nextDouble();

            p[i] = new Person(name, age, height);

            sumHeight += p[i].getHeight();

            if (p[i].getAge() < 16) {
                underSixteen ++;
                percentUnderSixteen = underSixteen / n * 100;
            }

        }
        System.out.printf("Altura média: %.2f\n", sumHeight / n);

        System.out.print("Pessoas com menos de 16 anos: " + percentUnderSixteen + "%");


    }
}
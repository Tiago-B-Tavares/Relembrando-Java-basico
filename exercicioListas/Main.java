package exercicioListas;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        ArrayList<Employee> employeeList = new ArrayList();

        System.out.print("How many employees will be registered? ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employeeList.add(employee);


        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Employee e : employeeList) {
            if (e.getId() == id) {
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                e.salaryIncrease(id, percentage);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        sc.close();
    }
}

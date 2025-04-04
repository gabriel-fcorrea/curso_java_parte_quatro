package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		Employee vect[] = new Employee[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			vect[i] = new Employee(id, name, salary);
		}

		System.out.print("\nEnter the emploee ID that will have salary increase: ");
		int selectedId = sc.nextInt();
		System.out.println();
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		double baseCalc;
		percentage = percentage / 100;

		for (int i = 0; i < vect.length; i++) {
			int idMatch = vect[i].getId();
			baseCalc = vect[i].getSalary();
			if (selectedId == idMatch) {
				baseCalc = baseCalc + (baseCalc * percentage);
				vect[i].setSalary(baseCalc);
			}
		}

		List<String> list = new ArrayList<>();

		for (Employee obj : vect) {
			String data = obj.toString();
			list.add(data);
		}

		System.out.println("\nList of employees: ");

		for (String employees : list) {
			System.out.println(employees);
		}

		sc.close();
	}

}

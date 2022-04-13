package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// DECLARANDO AS VARIAVEIS DOS TIPOS FUNCIONARIO
		Employee f1, f2;

		// INSTANCIANDO (CRIANDO) OS OBJETOS
		f1 = new Employee();
		f2 = new Employee();

		System.out.print("Dados do primeiro funcionário: ");
		f1.name = sc.next();
		f1.valuePerHour = sc.nextDouble();
		f1.hour = sc.nextInt();

		System.out.print("Dados do segundo funcionário: ");
		f2.name = sc.next();
		f2.valuePerHour = sc.nextDouble();
		f2.hour = sc.nextInt();

		double total = f1.total() + f2.total();

		System.out.printf("Total = %.2f%n", total);

		sc.close();
	}

}

package ejercicio01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CuentaCorriente cc = new CuentaCorriente("53962931D", "Pablo", 0);

		int opc;

		boolean salir = false;

		do {
			System.out.println();
			menu();
			System.out.println("Dime que acción quieres realizar (1 - 4)");
			opc = sc.nextInt();

			switch (opc) {
			case 1: {
				System.out.println("Dime cuanto dinero quieres sacar");
				double sacar = sc.nextDouble();
				if (sacar < 0) {
					System.out.println("Cantidad no válida");
				}
				cc.sacarDinero(sacar);
				break;
			}
			case 2: {
				System.out.println("Cuanto dinero quieres ingresar");
				double ingresar = sc.nextDouble();
				if (ingresar < 0) {
					System.out.println("Cantidad no válida");
				}
				cc.ingresarDinero(ingresar);
				break;
			}
			case 3: {
				System.out.println();
				cc.mostrarInfo();
				break;
			}
			case 4: {
				System.out.println("Saliendo...");
				salir = true;
				break;
			}
			default: {
				System.out.println("Opción no válida");
				break;
			}
			}
		} while (!salir);

	}

	public static void menu() {

		System.out.println(" - - - - - OPERACIONES - - - - - ");
		System.out.println("|                               |");
		System.out.println("|  1. Retirada de dinero        |");
		System.out.println("|  2. Ingreso de dinero         |");
		System.out.println("|  3. Información de la cuenta  |");
		System.out.println("|  4. Salir                     |");
		System.out.println("|                               |");
		System.out.println(" - - - - - - - - - - - - - - - - ");

	}

}

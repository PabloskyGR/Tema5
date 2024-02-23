package ejercicio01;

import java.util.Scanner;

public class Main {
	
	 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opc;
		
		menu();
		

	}
	
	public static void menu() {
		
		System.out.println(" - - - - - OPERACIONES - - - - - ");
		System.out.println("|                               |");
		System.out.println("|  1. Retirada de dinero        |");
		System.out.println("|  2. Ingreso de dinero         |");
		System.out.println("|  3. Informaciónd de la cuenta |");
		System.out.println("|                               |");
		System.out.println(" - - - - - - - - - - - - - - - - ");
		
	}
	
	public static void comprobacion(int opc) {
		
		do {
			opc = sc.nextInt();
		}while(opc < 1 || opc > 3);
		
	}

}

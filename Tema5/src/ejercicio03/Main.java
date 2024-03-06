package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(0,0);

		int x;
		int y;
		int dx;
		int dy;
		int px;
		int py;

		System.out.println("Dime las coordenadas 'x' e 'y': ");
		x = sc.nextInt();
		y = sc.nextInt();

		p1.setXY(x, y);

		System.out.print("Tus coordenadas son: ");
		p1.imprime();
		System.out.println(); 

		System.out.println("Dime cuanto se van a desplazar la 'x' y la 'y': ");
		dx = sc.nextInt();
		dy = sc.nextInt();

		p1.desplaza(dx, dy);

		System.out.print("Tus coordenadas se han desplazado a:");
		p1.imprime();
		System.out.println();

		System.out.println("Dime una nueva coordenada: ");
		px = sc.nextInt();
		py = sc.nextInt();

		p2.setXY(px, py);

		p1.distancia(p2);

		System.out.print("Entre las dos coordenadas hay una diferencia de: ");
		p2.imprime();

		sc.close();

	}
}

package ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		Articulo art = new Articulo("Fanta", 1.5, 10);
		art.imprime();
		
		System.err.println("- - - - - - - - - - - - ");
		System.out.println("Precio con IVA: " + art.getPVP());
		System.err.println("- - - - - - - - - - - - ");
		
		System.out.println("Precio con descuento: " + art.getPVPDescuento(50));
		System.err.println("- - - - - - - - - - - - ");
		
		
		System.out.println("Se han vendido 3 fantas");
		art.vender(3);
		System.err.println("- - - - - - - - - - - - ");
		art.imprime();
		System.err.println("- - - - - - - - - - - - ");
		
		System.out.println("Se ha rellenado con 6 fantas");
		art.almacenar(6);
		System.err.println("- - - - - - - - - - - - ");
		art.imprime();
	}

}

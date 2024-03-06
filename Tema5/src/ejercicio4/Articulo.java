package ejercicio4;

public class Articulo {

	private String nombre = "";
	private double precio = 0;
	public final double IVA = 0.21;
	private int cuantosQuedan = 0;

	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (cuantosQuedan > 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public void imprime() {
		System.out.println(
				"Nombre: " + this.nombre + "\nCantidad disponible: " + this.cuantosQuedan + "\nPrecio (Sin IVA): "
						+ this.precio + "€" + "\nPrecio (Con IVA): " + (this.precio + this.IVA * this.precio) + "€");

	}

	public double getPVP() {
		double pvp = 0;

		pvp = this.precio + (this.IVA * this.precio);

		return pvp;
	}

	public double getPVPDescuento(double descuento) {
		double pvpDescuento = 0;

		descuento /= 100;
		pvpDescuento = getPVP() - (descuento * getPVP());

		return pvpDescuento;
	}

	public boolean vender(int cantidad) {
		boolean dev = false;

		if (cantidad > 0 && this.cuantosQuedan >= cantidad) {
			this.cuantosQuedan -= cantidad;
			dev = true;
		}

		return dev;
	}

	public boolean almacenar(int cantidad) {
		boolean dev = false;

		if (cantidad > 0) {
			this.cuantosQuedan += cantidad;
			dev = true;
		}

		return dev;
	}

}

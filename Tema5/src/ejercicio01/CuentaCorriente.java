package ejercicio01;

public class CuentaCorriente {

	private String dni = "";
	private String nombre = "";
	private double saldo;

	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		this(dni, saldo);
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public boolean sacarDinero(double cantidad) {
		boolean confirmacion = false;

		if (cantidad >= 0 && cantidad <= this.saldo) {
			confirmacion = true;
			this.saldo -= cantidad;
		}

		return confirmacion;

	}

	public void ingresarDinero(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
		}
	}

	public void mostrarInfo() {
		System.out.println("Nombre del propietario: " + this.nombre);
		System.out.println("Dmi del propietario: " + this.dni);
		System.out.println("Saldo de la cuenta: " + this.saldo);
	}

	public String toString() {
		String cadena = "";
		cadena += "Nombre del propietario: " + this.nombre + "\n";
		cadena += "Dni del propietario: " + this.dni + "\n";
		cadena += "Saldo de la cuenta: " + this.saldo + "\n";

		return cadena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public String getDni() {
		return dni;
	}

}

package ejercicio01;

public class CuentaCorriente {

	String dni;
	String nombre;
	double saldo;

	public CuentaCorriente(String dni, double saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public boolean sacarDinero(double cantidad) {
		boolean confirmacion = false;
		
		if(cantidad >= 0 && cantidad < this.saldo) {
			confirmacion = true;
			this.saldo -= cantidad;
		}
		
		return confirmacion;
		
	}
	
	public void ingresarDinero(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre del propietario: " + this.nombre);
		System.out.println("DNi del propietario: " + this.dni);
		System.out.println("Saldo de la cuenta: " + this.saldo);
	}
	

}

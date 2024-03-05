package ejercicio02;

public class Libro {

	private String titulo = "";
	private String autor = "";
	private int ejemplares = 0;
	private int prestados = 0;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	public boolean prestamo() {
		boolean existencias = false;
		
		if(this.ejemplares > 0) {
			this.ejemplares--;
			this.prestados++;
			existencias = true;
		}
		
		return existencias;
	}
	
	public boolean devolucion() {
		boolean existencias = false;
		
		if(this.prestados > 0) {
			this.prestados--;
			this.ejemplares++;
		}
		
		return existencias;
	}

}

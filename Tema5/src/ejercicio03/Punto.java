package ejercicio03;

public class Punto {

	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void imprime() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public Punto distancia(Punto p) {
		p.x = p.x - this.x;
		p.y = p.y - this.y;
		
		return p;
	}

}

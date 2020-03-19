package app;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base) {
		super(base);
	}

	@Override
	public double calcPerimetro() {
		return 4 * getBase();
	}

	@Override
	public double calcDiagonal() {
		return getBase() * Math.sqrt(2);
	}

}
package app;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calcArea() {
		return getBase() * getAltura() / 2;
	}

	@Override
	public double calcPerimetro() {
		return 3 * getBase();
	}

}
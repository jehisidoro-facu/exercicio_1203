package app;

public abstract class Poligono extends Figura {

	public Poligono(double base, double altura) {
		super.setBase(base);
		super.setAltura(altura);
	}

	public Poligono(double base) {
		super.setBase(base);
	}

	public double calcArea() {
		return getBase() * getBase();
	}

	public double getBase() {
		return super.getBase();
	}

	public void setBase(double base) {
		super.setBase(base);
	}

	public double getAltura() {
		return super.getAltura();
	}

	public void setAltura(double altura) {
		super.setAltura(altura);
	}
}
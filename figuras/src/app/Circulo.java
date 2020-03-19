package app;

public class Circulo extends Figura {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double calcPerimetro() {
		return 2 * Math.PI * raio;
	}

}
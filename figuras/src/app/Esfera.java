package app;

public class Esfera extends Poligono3d {
	private double raio;

	public Esfera(double base, double altura, double profundidade, double raio) {
		super(base, altura, profundidade);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcVolume() {
		return (4 / 3) * Math.PI * Math.pow(raio, 3);
	}
}
package app;

public class Piramide extends Poligono3d {
	public Piramide(double base, double altura, double profundidade) {
		super(base, altura, profundidade);
	}

	@Override
	public double calcVolume() {
		return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
	}
}
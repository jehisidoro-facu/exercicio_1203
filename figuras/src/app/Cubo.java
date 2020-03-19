package app;

public class Cubo extends Poligono3d {
	public Cubo(double base, double altura, double profundidade) {
		super(base, altura, profundidade);
	}

	@Override
	public double calcVolume() {
		return getBase() * getAltura() * getProfundidade();
	}

}
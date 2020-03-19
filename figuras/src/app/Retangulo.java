package app;

public class Retangulo extends Poligono implements Diagonal {

    public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
    public double calcArea() {
        return getBase() * getAltura();
    }

    @Override
    public double calcPerimetro() {
        return 2 * getBase() + 2 * getAltura();
    }

    @Override
    public double calcDiagonal() {
        return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
    }

}
package app;

public class Losango extends Poligono {

    public Losango(double base) {
		super(base);
	}

	@Override
    public double calcPerimetro() {
        return 4 * getBase();
    }

}
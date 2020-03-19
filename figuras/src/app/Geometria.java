package app;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		ArrayList<Diagonal> diagonais = new ArrayList<Diagonal>();
		Circulo c = new Circulo(4);
		figuras.add(c);
		Losango l = new Losango(4);
		figuras.add(l);
		Quadrado q = new Quadrado(4);
		figuras.add(q);
		diagonais.add(q);
		Retangulo r = new Retangulo(4, 4);
		figuras.add(r);
		diagonais.add(r);
		Triangulo t = new Triangulo(4, 4);
		figuras.add(t);

		for (int i = 0; i < figuras.size(); i++) {
			System.out.println(figuras.get(i).getClass().toString());
			System.out.println("Área: " + figuras.get(i).calcArea() + figuras.get(i).calcArea());
			System.out.println("Perímetro: " + figuras.get(i).calcPerimetro() + "\n");
		}

		for (int i = 0; i < diagonais.size(); i++) {
			System.out.println(diagonais.get(i).getClass().toString());
			System.out.println("Diâmetro: " + diagonais.get(i).calcDiagonal() + "\n");
		}

		ArrayList<Poligono3d> figuras2 = new ArrayList<Poligono3d>();
		Cilindro cilindro = new Cilindro(5, 8, 4, 9);
		figuras2.add(cilindro);
		Cubo cubo = new Cubo(6, 6, 6);
		figuras2.add(cubo);
		Esfera esfera = new Esfera(3, 4, 4, 3);
		figuras2.add(esfera);
		Piramide piramide = new Piramide(8, 4, 4);
		figuras2.add(piramide);

		for (int i = 0; i < figuras2.size(); i++) {
			System.out.println(figuras2.get(i).getClass().toString());
			System.out.println("Volume: " + figuras2.get(i).calcVolume() + "\n");
		}
	}
}
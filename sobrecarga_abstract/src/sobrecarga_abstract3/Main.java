package sobrecarga_abstract3;

import java.awt.Color;

public class Main {

	    public static void main(String[] args) {
	        Circulo circulo1 = new Circulo(5);
	        Circulo circulo2 = new Circulo(7, Color.RED, Color.YELLOW);

	        Rectangulo rectangulo1 = new Rectangulo(3, 4);
	        Rectangulo rectangulo2 = new Rectangulo(6, 8, Color.BLUE, Color.GREEN);

	        Triangulo triangulo1 = new Triangulo(3, 5);
	        Triangulo triangulo2 = new Triangulo(6, 4, Color.ORANGE, Color.CYAN);
	    }
	}

package sobrecarga_abstract3;

import java.awt.Color;

class Circulo extends FiguraGeometrica {
    int radio;

    public Circulo(int radio, Color colorLinea, Color colorRelleno) {
        super(colorLinea, colorRelleno);
        this.radio = radio;
    }

    public Circulo(int radio) {
        this(radio, Color.BLACK, Color.WHITE); 
    }

    @Override
    void dibujar() {
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}


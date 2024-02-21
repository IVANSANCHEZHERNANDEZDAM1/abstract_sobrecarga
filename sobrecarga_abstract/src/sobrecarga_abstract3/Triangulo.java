package sobrecarga_abstract3;

import java.awt.Color;

class Triangulo extends FiguraGeometrica {
    int base;
    int altura;

    public Triangulo(int base, int altura, Color colorLinea, Color colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int base, int altura) {
        this(base, altura, Color.BLACK, Color.WHITE); 
    }

    @Override
    void dibujar() {
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2.0;
    }
}

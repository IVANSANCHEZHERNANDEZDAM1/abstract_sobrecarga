

package sobrecarga_abstract3;

import java.awt.Color;

abstract class FiguraGeometrica {
    Color colorLinea;
    Color colorRelleno;

    public FiguraGeometrica(Color colorLinea, Color colorRelleno) {
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
    }

    abstract void dibujar();
    abstract double calcularArea();
}


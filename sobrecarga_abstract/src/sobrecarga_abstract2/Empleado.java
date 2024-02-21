package sobrecarga_abstract2;

abstract class Empleado {
    String nombre;
    int id;
    double salario;
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.salario = 0; 
    }

    abstract double calcularSalario();

    abstract void mostrarDetalles();
}
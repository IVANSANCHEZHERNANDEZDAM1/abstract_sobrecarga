package sobrecarga_abstract2;
class Temporal extends Empleado {
    int periodoContrato;

    public Temporal(String nombre, int id, double salario, int periodoContrato) {
        super(nombre, id, salario);
        this.periodoContrato = periodoContrato;
    }

    @Override
    double calcularSalario() {
        return salario; 
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Empleado Temporal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + salario);
        System.out.println("Periodo de Contrato: " + periodoContrato + " meses");
    }

}

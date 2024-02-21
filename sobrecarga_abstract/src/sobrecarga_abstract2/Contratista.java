package sobrecarga_abstract2;

class Contratista extends Empleado {
    int periodoContrato;

    public Contratista(String nombre, int id, double salario, int periodoContrato) {
        super(nombre, id, salario);
        this.periodoContrato = periodoContrato;
    }

    @Override
    double calcularSalario() {
        return salario; 
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Empleado Contratista:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + salario);
        System.out.println("Periodo de Contrato: " + periodoContrato + " meses");
    }}
